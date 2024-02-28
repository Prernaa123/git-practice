package custPackage;

public class Customer {
	
	private String cname;
	private int cid;
	private long cphno;
	private String cemail;
	private CustomerAddress caddress;
	private String cpan;
	
	public Customer(String cname, int cid, long cphno, String cemail, CustomerAddress caddress, String cpan) {
		
		this.cname = cname;
		this.cid = cid;
		this.cphno = cphno;
		this.cemail = cemail;
		this.caddress = caddress;
		this.cpan = cpan;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public CustomerAddress getCaddress() {
		return caddress;
	}

	public void setCaddress(CustomerAddress caddress) {
		this.caddress = caddress;
	}

	public String getCpan() {
		return cpan;
	}

	public void setCpan(String cpan) {
		this.cpan = cpan;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", cphno=" + cphno + ", cemail=" + cemail + ", caddress="
				+ caddress + ", cpan=" + cpan + "]";
	}
	
}
