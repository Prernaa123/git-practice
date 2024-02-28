//Xylem---> sum of first and last= sum of middle number
//Phleom --->sum of first and last != sum of middle number
//1234
//1+4=5 sum of first and last digit
//2+3=5 sum of middle number
package interviewClass;

import java.util.Scanner;

public class XylemPhleom {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		boolean rs=isXylem(n);//1234
		if(rs==true)
			System.out.println("Xylem");
		else
			System.out.println("Phleom");

	}
	static boolean isXylem(int n)
	{
		int ls=0,ms=0;//ls=lastDigitSum  ms=middleDigitSum
		ls=n%10;
		n=n/10;
		while(n>9)
		{
			int r=n%10;
			ms=ms+r;
			n=n/10;
		}
		ls=ls+n;
	
	return ls==ms;
 }

}
