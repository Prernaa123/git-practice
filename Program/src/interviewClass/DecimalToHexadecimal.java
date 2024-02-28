package interviewClass;

import java.util.Scanner;

public class DecimalToHexadecimal {
//1.
//	public static void main(String[] args) {
//		int n = 32;
//		String hex = " ";
//		while(n>0) {
//			int r = n%16;
//			if(r>9) {
//				hex= (char)(55+r)+hex;
//			}
//			else {
//				hex=r+hex;
//			}
//			n=n/16;
//		}
//		System.out.println(hex);
//		// TODO Auto-generated method stub
//
//	}
	
//2.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		String hex="";
		while(n>0)//31
		{
		//     15=31%16   //0=32%16
			int r=n%16;
			if(r>9)
			{
				hex=(char)(55+r)+hex;
			}
			else
			{
				hex=r+hex;//concat b/w r and hex
			}
			n=n/16;
	}
		System.out.println(hex);

}
}
