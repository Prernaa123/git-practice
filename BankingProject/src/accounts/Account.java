package accounts;

public class Account {
	private long acnt_no;
	private String holder_name;
	private String IFSC_code;
	private String branch_name;
	private String acnt_type;
	private double acnt_bal;
	
//	constructor declaration
	public Account(long acnt_no,String IFSC_code, String holder_name, 
			String branch_name, String acnt_type,double acnt_bal) {
		super();
		this.acnt_no = acnt_no;
		this.IFSC_code=IFSC_code;
		this.holder_name = holder_name;
		this.branch_name = branch_name;
		this.acnt_type=acnt_type;
		this.acnt_bal=acnt_bal;
	}
//	allowing getters and setters methods to access and mutate the info
	
	public long getAcnt_no() {
		return acnt_no;
	}
	public String getHolder_name() {
		return holder_name;
	}
	public String getIFSC_code() {
		return IFSC_code;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public String getAcnt_type() {
		return acnt_type;
	}
	public double getAcnt_bal() {
		return acnt_bal;
	}
	public void setAcnt_no(long acnt_no) {
		this.acnt_no = acnt_no;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public void setAcnt_type(String acnt_type) {
		this.acnt_type=acnt_type;
	}
	public void setAcnt_bal(double acnt_bal) {
		this.acnt_bal=acnt_bal;
	}
	
}
