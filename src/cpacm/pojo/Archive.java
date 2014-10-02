package cpacm.pojo;

public class Archive {

	private int aid;
	private String title;
	private String year;//���
	private String dcNumber;//�ĺ�
	private int classid;//�����
	private String fileNum;//�����
	private String location;//���ڵ�
	private String level;//�ܼ�
	private String outDate;//��������
	private String partNum;//����
	private String date1;//¼�����ڿ�ʼ
	private String date2;//¼�����ڽ���
	private int isBorrow;//�Ƿ����
	
	//HibernateҪ�������һ���յĹ��캯��
	public Archive() {
		
	}
	

	//�Զ����һ�����캯��
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

	//���涼�����Ե�get,set����
	
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
