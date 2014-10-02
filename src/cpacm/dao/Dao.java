package cpacm.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;

public abstract class Dao<T,ID extends Serializable> implements IDao<T, ID>{
	
	private SessionFactory sessionFactory;//�������ݿ����ӣ�ʹ��springʵ�ּ��أ�
    private Class<T> persistentClass;
   
    //sessionFactory��get��set������
	public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
   
    //�ù��췽������Class<T>����Ϊ�̶�ģʽ
    @SuppressWarnings("unchecked")
	public Dao()
    {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
   
    public Class<T> getPersistentClass() {
        return persistentClass;
    }
   
    //�Ա�Ĳ�������ɾ�Ĳ飩
    //����
    public void save(T transientInstance) throws Exception
    {
        try {
        	Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin();
            session.save(transientInstance);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            throw e;
        }
    }
   
    //ɾ��
    public void delete(T persistentInstance) throws Exception
    {
        try {
        	Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin(); 
            session.delete(persistentInstance);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            throw e;
        }
    }
   
   
    //����
    public void update(T instance) throws Exception
    {
        try {
        	Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin(); 
    	    session.saveOrUpdate(instance);
    	    session.getTransaction().commit();
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }
   
   
    //���ݴ�������HQL�����£�������Ӱ������
    public int updateByQuery(String hql)
    {
        int k=0;
        try {
        	Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin(); 
            k=session.createQuery(hql).executeUpdate();
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
        return k;
    }
   
    //���ݴ�������ID���в�ѯ
    public T findById(ID id)
    {
       
        try {
            Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin(); 
    	    @SuppressWarnings("unchecked")
			T instance = (T) session.get(getPersistentClass(), id);
    	    session.getTransaction().commit();
            return instance;
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }
   
    //���ݴ�������hql��ѯ
    @SuppressWarnings("unchecked")
	public List<T> findByQuery(String hql)
    {
        try {
        	Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin(); 
    	    List<T> q = session.createQuery(hql).list();
    	    session.getTransaction().commit();
    	    return q;
            /*return sessionFactory.getCurrentSession().createQuery(hql).list();*/
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }
   
    //�������б������������
    public List<T> findAll()
    {
        try {
            return findByCriteria();//���������findByCriteria����
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }
   
    //���ұ�����������ݲ�����
    @SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion) {
    	Session session= getSessionFactory().getCurrentSession();
	    session.getTransaction().begin(); 
        Criteria crit = session.createCriteria(
                getPersistentClass());
        session.getTransaction().commit();
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return crit.list();
    }
   
    //jQuery Easyui Datagrid��Ҫ�ķ��������ݴ�������hql����ǰҳ����ҳ�泤�ȷ���������
    public List<T> queryForPage(String hql, int offset, int length) {
        try{
        	Session session= getSessionFactory().getCurrentSession();
    	    session.getTransaction().begin(); 
            @SuppressWarnings("unchecked")
			List<T> results=session.createQuery(hql)
                    .setFirstResult(offset)
                    .setMaxResults(length)
                    .list();
            session.getTransaction().commit();
            return results;
        }catch (RuntimeException re) {
            throw re;
        }
    }
}
