package interviewClass;

public class PrintNumInReverseOrder {

	public static void main(String[] args) {
		int n=1234;
		int rem=0;
		while(n!=0) {
			rem=n%10;//4
			System.out.print(rem);
			n=n/10;//123
		}

	}

}
