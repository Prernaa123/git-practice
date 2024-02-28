package interviewClass;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the value  ");
		int n= sc.nextInt();
		
		boolean rs=isHappy(n);
		if(rs==true) 
			System.out.println(" Happy Number" );
		else {
			System.out.println("Not Happy Number");
		}
	}
		static boolean isHappy(int n)
		{
			while(n>9)
			{
				int sum=0;
				while(n>0)
				{
					int r=n%10;
					sum=sum+r*r;
					n=n/10;
				}
				n=sum;
			}
			return n==1||n==7;
	}

}
