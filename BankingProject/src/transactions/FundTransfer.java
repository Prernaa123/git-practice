package transactions;
import accounts.Account;
public class FundTransfer {
	public boolean transfer(Account from_acc,Account to_acc,double arg3) {
		if(from_acc.getAcnt_bal()>arg3) {
			from_acc.setAcnt_bal(from_acc.getAcnt_bal()-arg3);
			to_acc.setAcnt_bal(to_acc.getAcnt_bal()+arg3);
			return true;
		}
		else {
			return false;
		}
	}
}
