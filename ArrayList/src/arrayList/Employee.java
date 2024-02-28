package arrayList;

import java.util.ArrayList;

public class Employee {
	private int eid;//eId or e_id(snakecase)
	private String ename;
	private double esal;
	private  String eDesignation;
	private long phno;
	
	public Employee(int eid, String ename, double esal, String eDesignation, long phno) {

		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eDesignation = eDesignation;
		this.phno = phno;
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

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eDesignation=" + eDesignation
				+ ", phno=" + phno + "]";
	}
	
	
}
	

