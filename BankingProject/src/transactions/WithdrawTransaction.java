package transactions;
//import accounts.AccountCreation;
import accounts.Account;
public class WithdrawTransaction {
	public boolean withdraw(Account arg1,double arg2){
			if(arg1.getAcnt_bal()>arg2) {
				arg1.setAcnt_bal(arg1.getAcnt_bal()-arg2);
				return true;
			}
			else {
				return false;
			}
	}
}
