package interviewClass;
import java.util.Scanner;
public class CheckMiddleValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		System.out.println("Enter x: ");
		int x =sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		System.out.println("Enter z: ");
		
		int z = sc.nextInt();
		
		if(x>y && x<z || x>z && x<y)
			System.out.println(x+ "x is middle value");
		else if(y>x && y<z || y>z && y<x)
			System.out.println(y+ "y is middle value");
		else
			System.out.println(z+ "z is middle value");
	}

}

