package interviewClass;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9;
		int sqr=n*n;
		int rem,sum=0;
		
		while(sqr>0)
		{
			rem=sqr%10;
			sum+=rem;
			sqr=sqr/10;
		}
		if(sum==n)
		{
			System.out.println("Number is neon");
		}
		else
		{
			System.out.println("not a neon number");
		}
	}

}
