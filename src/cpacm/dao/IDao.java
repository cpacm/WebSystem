package cpacm.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T, ID extends Serializable> {

	public void save(T transientInstance) throws Exception;

	public void delete(T persistentInstance) throws Exception;

	public void update(T instance) throws Exception;

	public int updateByQuery(String hql);

	public T findById(ID id);

	public List<T> findAll();

	public List<T> queryForPage(String hql, int offset, int length);

	public List<T> findByQuery(String queryString);
}
