package cpacm.service;

import java.util.List;

import cpacm.dao.ArchiveDao;
import cpacm.pojo.Archive;

public class ArchiveService implements IArchiveService {
	
	private ArchiveDao archiveDao;

	@Override
	public void save(Archive transientInstance) throws Exception {
		// TODO Auto-generated method stub
		archiveDao.save(transientInstance);
	}

	@Override
	public void delete(Archive persistentInstance) throws Exception {
		// TODO Auto-generated method stub
		archiveDao.delete(persistentInstance);
	}

	@Override
	public void update(Archive instance) throws Exception {
		// TODO Auto-generated method stub
		archiveDao.update(instance);
	}

	@Override
	public int updateByQuery(String hql) {
		// TODO Auto-generated method stub
		return archiveDao.updateByQuery(hql);
	}

	@Override
	public Archive findById(Integer id) {
		// TODO Auto-generated method stub
		return archiveDao.findById(id);
	}

	@Override
	public List<Archive> findAll() {
		// TODO Auto-generated method stub
		return archiveDao.findAll();
	}

	@Override
	public List<Archive> queryForPage(String hql, int offset, int length) {
		// TODO Auto-generated method stub
		return archiveDao.queryForPage(hql, offset, length);
	}

	@Override
	public List<Archive> findByQuery(String queryString) {
		// TODO Auto-generated method stub
		return archiveDao.findByQuery(queryString);
	}

	public ArchiveDao getArchiveDao() {
		return archiveDao;
	}

	public void setArchiveDao(ArchiveDao archiveDao) {
		this.archiveDao = archiveDao;
	}
	
	

}
