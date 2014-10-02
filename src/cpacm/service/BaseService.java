package cpacm.service;

import java.util.List;

import cpacm.dao.BaseDao;

public class BaseService<T> {

	private BaseDao dao;    
    
    public List<T> query(String queryString){    
        return dao.getObjects(queryString);  
    }
      
    public BaseDao getDao() {  
        return dao;  
    }  
  
    public void setDao(BaseDao dao) {  
        this.dao = dao;  
    } 
}
