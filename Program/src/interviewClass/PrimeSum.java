package interviewClass;

public class PrimeSum {
	static boolean isPrime(int n) {//this code is based on factor
		int c=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				c++;
			}
		}
		return c==2;
	}

	public static void main(String[] args) {
			int sum = 0;
			int m=5;
			for(int i=1;i<=m;i++) {
				sum=sum+i;
			}
			System.out.println(isPrime(sum)?"Prime Sum":"Not Prime Sum");
		}
}
