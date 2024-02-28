package interviewClass;

public class FibonacciSeries {
//1.
 public static void main(String[] args){	
	int n1=0,n2=1,sum=0;
	int i=1;
	while(i<=5) {
		System.out.println(n1);
		sum=n1+n2;
		n1=n2;
		n2=sum;
		i++;
	}
}
}
//check whether number is fibonacci number or not
//	static boolean isFib(int n)
//	{
//		int n1=0,n2=1,sum=0;
//		while(n1<=n)
//		{
//			if(n1==n) {
//				return true;
//			}
//			sum=n1+n2;
//			n1=n2;
//			n2=sum;
//		}
//		return false;
//		
//	}
//	
//	public static void main(String[] args) {
//         int n=5;
//		System.out.println(isFib(n)?"fib no":"not fib no");
//	}
//
//}
