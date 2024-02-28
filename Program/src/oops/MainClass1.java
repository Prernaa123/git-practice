package oops;

class Demo 
{
	static int x=10;
	static double y=3.4;
	
	static void test()
	{
		System.out.println("running static");
	}
}
public class MainClass1
{
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("x value is"+Demo.x);
		System.out.println("y value is"+Demo.y);
		
		Demo.test();
		System.out.println("Modifyin x and y");
		Demo.x=25;
		Demo.y=45.14;
		System.out.println("x value is"+Demo.x);
		System.out.println("y value is"+Demo.y);
		System.out.println("main method ended");
	}
}
