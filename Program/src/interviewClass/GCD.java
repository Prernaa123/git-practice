package interviewClass;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value ");
		int n = sc.nextInt();//12
		System.out.println("Enter second value ");
		int m=sc.nextInt();//36
//1.		
//		int gcd=0;
//		for(int i=1;i<=n && i<=m;i++) 
//		{
//			if(n%i==0 && m%i==0)
//			{
//				gcd=i;
//			}
//			System.out.println(gcd);
//		}

//2.    
		int gcd=0;
		for(int i=1;i<=n;i++)//here it will go upto 12 iteration 
			//for(int i=1;i<=m;i++) here it will go upto 36 iteration
		{
			if(n%i==0 && m%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);

	}

}
