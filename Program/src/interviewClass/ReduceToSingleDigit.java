package interviewClass;

public class ReduceToSingleDigit {

	 static int sumDigit(int n)
		{
			int rem=0,sum=0;
			while(n!=0)
			{
				 rem=n%10;
				 sum=sum+rem;
				 n=n/10;
			}
			return sum;
		}
	 public static void main(String[] args) {
		 int n=18;
		 while(n>9) {
			 n=sumDigit(n);
	}
	 System.out.println(n);

	 }
}
