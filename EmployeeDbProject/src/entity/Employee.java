package entity;

public class Employee {

//eid,ename,edesignation,esal,ephno,eage
//java bean class
//public getters and setters
//toString
	
	private int eid;//private Integer eid(wrapper class --> fully object oriented)
	private String ename;
	private String edesignation;
	private double esal;
	private long ephno;
	private int age;
	
	public Employee(int eid, String ename, String edesignation, double esal, long ephno, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesignation = edesignation;
		this.esal = esal;
		this.ephno = ephno;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public long getEphno() {
		return ephno;
	}

	public void setEphno(long ephno) {
		this.ephno = ephno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", esal=" + esal
				+ ", ephno=" + ephno + ", age=" + age + "]";
	}
	//toString() -->return fully qualified class name
	
	
}
