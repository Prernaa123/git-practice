//Strong Number --> sum of factorial of each digit is equal to same no.

package Revision;

public class StrongNumber {
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int n=145,rem=0,sum=0;
		int m=n;
		
		while(n!=0) {
			rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
			
		}
		if(m==sum) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not a Strong number");
		}
	}

}
