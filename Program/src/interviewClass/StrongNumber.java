package interviewClass;

public class StrongNumber {
	static int factorial(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n=145,m=n;
		int sum=0,rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;
		}
		if(sum==m) {
			System.out.println("Strong no.....!!!");
			
		}
		else {
			System.out.println("Not a Strong no...!!!");
		}

	}

}
