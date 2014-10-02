package cpacm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cpacm.pojo.Archive;

public class BaseDao {

	private SessionFactory sessionFactory;

	/** ≤È—Ø */
	public <T> List<T> getObjects(String queryString) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.getTransaction();
		ts.begin();
		try {
			Query q = session.createQuery(queryString);
			@SuppressWarnings("unchecked")
			List<T> list = q.list();
			ts.commit();
			session.close();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ts.rollback();
			e.printStackTrace();
		}
		return null;
	}

	/** ÃÌº”  **/
	public void addObjects(String queryString) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.getTransaction();
		ts.begin();
		String k = "5";
		Archive message = new Archive(1, k, k, k, 2, k, k, k, k, k, k, k, 3);
		try {
			session.save(message);
			ts.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ts.rollback();
			e.printStackTrace();
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
