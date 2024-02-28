package interviewClass;

public class ArmStrongNumber {
	 static int countDigit(int n)
	{
		int c=0;
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		return c;
	}
	
	static int power(int base ,int exp)
	{
		int pow=1;
		for(int i=1;i<=exp;i++)
		{
			pow=pow*base;
		}
		return pow;
	}

	public static void main(String[] args) {
		int n=153,m=n;
		int exp=countDigit(n);
		int sum=0,rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+power(rem,exp);
			n=n/10;
		}
		System.out.println(sum==m?"Armstrong No":"Not Armstrong No.");
	}

}
