package interviewClass;

import java.util.Scanner;

public class DeseriumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();//5

		boolean rs=isArmStrong(n);
		if(rs==true)
		
			System.out.println("Deserium");
		else
			System.out.println("Not Deserium");
		}
	static boolean isArmStrong(int n)//5
	{
		int sum=0,temp=0;
		int cd=countDigit(n);
		while(n>0)
		{
			int r=n%10;
			sum=sum+power(r,cd);
			n=n/10;
			cd--;
		}
		return temp==sum;
}
	static int power(int n,int p) {
		int pow=1;
		for(int i=1;i<=p;i++) {
			pow=pow*n;
		}
		return pow;
	}
	static int countDigit(int n)
   {
		int count =0;
		while(n>0) 
		{
			count++;
			n=n/10;
		}
		return count;
   }
		
}