//n=1101 --> 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0
//              
package interviewClass;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the octal value ");
		int oct=sc.nextInt();
		int dec=0,p=0;//p=1;
		while(oct>0)
		{
			
			int r=oct%10;//giving last number//r=1
			dec=dec+(r*power(8,p));//dec=dec+r*p;
			oct=oct/10;//removing last number//1//bin=bin/10;
			p++;//4//p=p*8;
		}
		System.out.println(dec);
	}
	
	static int power(int n,int p) {//2 3
		int pow=1;
		for(int i=1;i<=p;i++) {
			pow=pow*n;
		}
		return pow;
	}
}
