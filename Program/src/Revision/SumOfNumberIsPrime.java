package Revision;

public class SumOfNumberIsPrime {
	
	public static String isPrime(int n) {
		int c =0;
		for(int  i =1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		return c==2?"prime":"Not prime";
		
	}
	public static void main(String[] args) {
		int n = 2;
		int sum = 0;
		for(int i =1;i<=n;i++) {
			sum = sum + i;
		}
		System.out.println(isPrime(sum));
	}

}
