package MemoryAreaOfJVM;

public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Demo2 d1=new Demo2();
		Demo3 d2=new Demo3();
		Demo2 d3=new Demo3();//upcasting
		d1.display();
		d2.display();
		d3.display();

	}

}
