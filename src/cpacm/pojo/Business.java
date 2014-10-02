package cpacm.pojo;

import java.sql.Date;

public class Business {

	private int bid;
	private String user;//土地使用者
	private String location;//土地坐落
	private String license;//证号
	private String figNumber;//图号
	private String landNumber;//地号
	private String appNumber;//批准问号
	private int level;//土地等级
	private int classId;//分类号
	private String userLocation;//所在地
	private String fileNum;//案卷号
	private Date date1;//发证日期开始
	private Date date2;//发证日期结束
	private boolean isBorrow;//是否出借
	public Business() {

	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getFigNumber() {
		return figNumber;
	}
	public void setFigNumber(String figNumber) {
		this.figNumber = figNumber;
	}
	public String getLandNumber() {
		return landNumber;
	}
	public void setLandNumber(String landNumber) {
		this.landNumber = landNumber;
	}
	public String getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getFileNum() {
		return fileNum;
	}
	public void setFileNum(String fileNum) {
		this.fileNum = fileNum;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}
	public boolean isBorrow() {
		return isBorrow;
	}
	public void setBorrow(boolean isBorrow) {
		this.isBorrow = isBorrow;
	}

	
	
}
