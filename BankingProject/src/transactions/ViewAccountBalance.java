package transactions;
import accounts.Account;
public class ViewAccountBalance {
	public void viewBalance(Account arg1) {
		System.out.println("Your Account Balance is: "+arg1.getAcnt_bal());
	}
}
