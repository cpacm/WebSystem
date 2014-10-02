package cpacm.action;

import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cpacm.pojo.Archive;
import cpacm.service.ArchiveService;
import cpacm.service.BaseService;

public class ArchiveAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7966166028096000810L;

	private Archive acv = new Archive();

	private BaseService<Archive> baseService;
	
	private ArchiveService archiveService;

	private List<Archive> Archives;
	
	private static String lastQueryString;
	
	private int tag;

	public String Query() {
		String queryString;
		queryString = "select a from Archive as a ";
		queryString += "where ";
		queryString += "a.classid like '%" + acv.getClassid() + "%' ";

		queryString += "and ";
		queryString += "a.date1 like '%" + acv.getDate1() + "%' ";
		queryString+="and ";
		queryString+="date2 like '%"+acv.getDate2()+"%' ";
		queryString+="and ";
		queryString+="dcNumber like '%"+acv.getDcNumber()+"%' ";
		queryString+="and ";
		queryString+="fileNum like '%"+acv.getFileNum()+"%' ";
		queryString+="and ";
		queryString+="level like '%"+acv.getLevel()+"%' ";
		queryString+="and ";
		queryString+="location like '%"+acv.getLocation()+"%' ";
		queryString+="and ";
		queryString+="outDate like '%"+acv.getOutDate()+"%' ";
		queryString+="and ";
		queryString+="partNum like '%"+acv.getPartNum()+"%' ";
		queryString+="and ";
		queryString+="title like '%"+acv.getTitle()+"%' ";
		queryString+="and ";
		queryString+="year like '%"+acv.getYear()+"%' ";
		lastQueryString = queryString;
		System.out.println("lastQueryString"+lastQueryString);
		System.out.println("queryString"+queryString);
		Archives = archiveService.findByQuery(queryString);
		return "Query";
	}
	
	public String LastQuery(){
		Archives = archiveService.findByQuery(lastQueryString);
		return "Query";
	}

	public String toUpdate(){
		acv = archiveService.findById(acv.getAid());
		return "toUpdate";
	}
	public String Update(){
		try {
			archiveService.update(acv);
			LastQuery();
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}
	public String Delete(){
		try {
			archiveService.delete(acv);
			LastQuery();
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}
	public String Add(){
		try {
			archiveService.save(acv);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}
	public String QueryByclassID(){
		String queryString;
		queryString = "select a from Archive as a ";
		queryString += "where ";
		queryString += "a.classid = '" + acv.getClassid() + "'";
		System.out.println("queryString"+queryString);
		lastQueryString = queryString;
		Archives = archiveService.findByQuery(queryString);
		return "success";
		
	}
	
	
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

	public ArchiveService getArchiveService() {
		return archiveService;
	}

	public void setArchiveService(ArchiveService archiveSerive) {
		this.archiveService = archiveSerive;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}
	
	

}
