package interviewClass;

public class SumOfEvenDigit {

	public static void main(String[] args) {
		int n=4365;
		int sum=0;
		int rem=0,e=0,O=0;//E=even,O=Odd
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			n=n/10;
	}
		System.out.println(sum);
	}
}
