package interviewClass;
import java.util.Scanner;
public class TechNumber {
	static int Count(int n1) {
		int c=0;
		while(n1!=0) {
			n1=n1/10;
			c++;
		}
		int sum=0;
		if(c%2==0) {
			int m=(int)Math.pow(10, c/2);
			int n2;
			int sum1=(n2%m)+(n2/m);
			System.out.println(sum1);
		}
		else {
			System.out.println("invalid");
		}
		
			
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n1 = sc.nextInt();
	int m=sc.nextInt();
	
	n2=sc.nextInt();
	int n=Count(n1);
	

	}

}
