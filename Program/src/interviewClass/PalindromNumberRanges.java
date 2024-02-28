package interviewClass;

import java.util.Scanner;

public class PalindromNumberRanges {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value ");
		int n = sc.nextInt();
		System.out.println("Enter second value ");
		int m=sc.nextInt();//36
		
		int sum=0;
		for(int i=n;i<=m;i++)
		{
			boolean rs =isPal(i);
			if(rs==true) {
				System.out.println(i+" ");
				sum=sum+i;
			}
		}
		System.out.println("sum"+sum);
	}
	static boolean isPal(int n) {
		int rev=0,temp=n;
		while(n>0) {
			int r=n%10;
			rev=rev *10+r;
			n=n/10;
		}
		return rev==temp;
	}
}
