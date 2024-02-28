package accounts;

public class AccountCreation {
	public Account createAccount(long acnt_no,
	String holder_name,String IFSC_code,String branch_name,
	String acnt_type,double acnt_bal) {
		
		Account a1=new Account(acnt_no, holder_name, IFSC_code, branch_name, acnt_type, acnt_bal);
		
		return a1;
	}
}
