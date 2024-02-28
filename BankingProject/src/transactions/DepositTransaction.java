package transactions;
//import accounts.AccountCreation;
import accounts.Account;
public class DepositTransaction {
	public void deposit(Account arg1,double arg2) {
		arg1.setAcnt_bal(arg1.getAcnt_bal()+arg2);
	}
}
