//Bin to Oct --> first we have to convert into bin to decimal
//Bin to Hexdec -->first we have to convert into bin to decimal
//


package interviewClass;
import java.util.Scanner;
public class BinaryToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary values ");
		int bin = sc.nextInt();//1101
		
		System.out.println(bin+" binary value");
		int dec=BinToDec(bin);//Binary to decimal
		System.out.println(dec+" decimal value");
		
		String oct = DecToOct(dec);
		System.out.println(oct+" oct value");
	}
	static int BinToDec(int bin)//1101
	{
		int dec=0,p=1;
		while(bin>0)
		{
			int r=bin%10;
			dec=dec+r*p;
			bin=bin/10;
			p=p*2;
		}
		return dec;
	}
	static String DecToOct(int dec)
	{
		String oct="";
		while(dec>0)
		{
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}
		return oct;
	}

}
