package abstraction;

public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Demo1 d1;
		d1 = new Sample1();//upcasting
		d1.test();
		d1.disp();
		
		System.out.println("main method ended");

	}

}
