package app;
//import java.util.Scanner;
import accounts.AccountCreation;
import transactions.DepositTransaction;
import transactions.FundTransfer;
import transactions.ViewAccountBalance;
import transactions.WithdrawTransaction;
import accounts.Account;
public class MainClass {
	public static void main(String[] args) {
		AccountCreation a1=new AccountCreation();
		Account ac1=a1.createAccount(1234, "AMAN", "SBI2004", "SBI_BTM", "SAVINGS", 400000.00);
		Account ac2=a1.createAccount(1235, "SHASHI", "BOI2008", "BOI_BTM", "CURRENT", 200000.00);
		System.out.println(ac1.getAcnt_bal());
		DepositTransaction d1= new DepositTransaction();
		d1.deposit(ac1,20000);
		WithdrawTransaction w1= new WithdrawTransaction();
		System.out.println(w1.withdraw(ac1, 4000));
		FundTransfer f1= new FundTransfer();
		System.out.println(f1.transfer(ac1, ac2, 430000));
		ViewAccountBalance v1= new ViewAccountBalance();
		v1.viewBalance(ac1);
		v1.viewBalance(ac2);
	}
}
