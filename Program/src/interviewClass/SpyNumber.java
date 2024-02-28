package interviewClass;

public class SpyNumber {

	public static void main(String[] args) {
		int n=22;
		int rem=0;
		int sum=0;
		int pro=1;//product

		while(n!=0) {
			rem = n%10;
			sum = sum+rem;
			pro = pro*rem;
			n=n/10;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+pro);
		if(sum==pro) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a spy number");
		}
	}
	
	
	

}
