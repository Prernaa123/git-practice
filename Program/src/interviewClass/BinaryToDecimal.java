//n=1101 --> 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0
//              
package interviewClass;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();//n=1101
		int sum=0,p=0;//p=1//int dec=0,p=0;
		while(n>0)//1//while(bin>0)
		{
			
			int r=n%10;//giving last number//r=1
			sum=sum+(r*power(2,p));// sum=13//sum=sum+r*p;//dec=dec+r*(power(2,p));
			n=n/10;//removing last number//1//bin=bin/10;
			p++;//4//p=p*2;
		}
		System.out.println(sum);
	}
	
	static int power(int n,int p) {//2 3
		int pow=1;
		for(int i=1;i<=p;i++) {
			pow=pow*n;
		}
		return pow;
	}
}
