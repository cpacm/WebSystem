package cpacm.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;

public abstract class Dao<T,ID extends Serializable> implements IDao<T, ID>{
	
	private SessionFactory sessionFactory;//加载数据库连接（使用spring实现加载）
    private Class<T> persistentClass;
   
    //sessionFactory的get和set方法。
	public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
   
    //用构造方法处理Class<T>以下为固定模式
    @SuppressWarnings("unchecked")
	public Dao()
    {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
   
    public Class<T> getPersistentClass() {
        return persistentClass;
    }
   
    //对表的操作（增删改查）
    //保存
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
   
    //删除
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
   
   
    //更新
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
   
   
    //根据传进来的HQL语句更新，返回受影响行数
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
   
    //根据传进来的ID进行查询
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
   
    //根据传进来的hql查询
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
   
    //查找所有表里的所有内容
    public List<T> findAll()
    {
        try {
            return findByCriteria();//调用下面的findByCriteria方法
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw e;
        }
    }
   
    //查找表里的所有内容并返回
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
   
    //jQuery Easyui Datagrid需要的方法，根据传进来的hql，当前页数，页面长度返回数据列
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
