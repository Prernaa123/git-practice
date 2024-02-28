//recursion--> function calling itself
package recursion;

public class FibonacciSeriesUsingRecursion {
	static int n1=0,n2=1,sum=0;
	
	static void fun(int n) {
		if(n>=1) {
			System.out.println(n1);//0
			sum=n1+n2;//sum=0+1=1
			n1=n2;//n1=1(n2)
			n2=sum;//n2=1(sum)
			fun(n-1);
		}
	}

	public static void main(String[] args) {
		
		fun(10);
	}

}
