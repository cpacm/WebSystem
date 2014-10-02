package cpacm.pojo;

public class Archive {

	private int aid;
	private String title;
	private String year;//年度
	private String dcNumber;//文号
	private int classid;//分类号
	private String fileNum;//案卷号
	private String location;//所在地
	private String level;//密级
	private String outDate;//保管期限
	private String partNum;//件号
	private String date1;//录入日期开始
	private String date2;//录入日期结束
	private int isBorrow;//是否出借
	
	//Hibernate要求必须有一个空的构造函数
	public Archive() {
		
	}
	

	//自定义的一个构造函数
	public Archive(int aid, String title, String year, String dcNumber,
			int classid, String fileNum, String location, String level,
			String outDate, String partNum, String date1, String date2, int isBorrow) {
		super();
		this.aid = aid;
		this.title = title;
		this.year = year;
		this.dcNumber = dcNumber;
		this.classid = classid;
		this.fileNum = fileNum;
		this.location = location;
		this.level = level;
		this.outDate = outDate;
		this.partNum = partNum;
		this.date1 = date1;
		this.date2 = date2;
		this.isBorrow = isBorrow;
	}

	//下面都是属性的get,set方法
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDcNumber() {
		return dcNumber;
	}

	public void setDcNumber(String dcNumber) {
		this.dcNumber = dcNumber;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getFileNum() {
		return fileNum;
	}

	public void setFileNum(String fileNum) {
		this.fileNum = fileNum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getOutDate() {
		return outDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	public int getIsBorrow() {
		return isBorrow;
	}

	public void setIsBorrow(int isBorrow) {
		this.isBorrow = isBorrow;
	}

	
	
	
	
	
	
}
