package cpacm.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cpacm.pojo.Archive;
import cpacm.service.BaseService;


public class QueryAllAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8802354183655930544L;

	private Archive acv = new Archive();
	
	private BaseService<Archive> baseService;
	
	private List<Archive> Archives;
	

	public Archive getAcv() {
		return acv;
	}

	public void setAcv(Archive acv) {
		this.acv = acv;
	}

	public BaseService<Archive> getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService<Archive> baseService) {
		this.baseService = baseService;
	}

	public List<Archive> getArchives() {
		return Archives;
	}

	public void setArchives(List<Archive> archives) {
		Archives = archives;
	}  
	
}
