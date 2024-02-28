package interviewClass;

public class PrimeNumber {
//1.	
//	static String isPrime(int n)
//	{
//		int c=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				c++;
//			}
//		}
//		return c==2?"prime":"not prime";
//	}
//
//	public static void main(String[] args) {
//		System.out.println(isPrime(2));
//	}
	
//2.	
//public static void main(String[] args)
//{
//	int n=29;
//	int c=0;
//	for(int i=1;i<=n;i++)
//	{
//		if(n%i==0)
//		{
//			c++;
//		}
//	}
//	if(c==2)
//	{
//		System.out.println("Prime no.");
//	}
//	else
//	{
//		System.out.println("Not prime no.");
//	}
//}

//3.
	static boolean isPrime(int n)
	{
		if(n <=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(isPrime(7));
		System.out.println(isPrime(77));
	}

}
