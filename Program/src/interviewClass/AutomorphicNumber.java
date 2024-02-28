package interviewClass;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the value  ");
		int n= sc.nextInt();
		
		boolean rs=is(n);
		if(rs==true) 
			System.out.println(" auto "+n*n);
		else {
			System.out.println("not auto "+n*n);
		}
	}
		static boolean is(int n)//6
		{
			int sq=n*n;//36
			while(n>0)
			{
				int r=n%10;//6
				int r1=sq%10;//6
				if(r!=r1) {
					break;
				}
				
				n=n/10;//0
				sq=sq/10;//3
			}
			return n==0;
		}
	

}
