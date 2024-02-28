package interviewClass;

import java.util.Scanner;

public class SquartNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the value  ");
		int n= sc.nextInt();
		
		double t=0.0,sq=n;//8
		
		while((t-sq)!=0)
		{
			t=sq;
			
			sq=(t+(n/t))/2;
			
			//System.out.println(sq+" sq");
		}
		System.out.println(sq+" final");
	}

}
