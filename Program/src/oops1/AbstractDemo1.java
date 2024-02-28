package oops1;

public abstract class AbstractDemo1 {
	static int x=10;
			int y=20;
	
	AbstractDemo1(){
		System.out.println("Ruunning Demo1() constructor");
	}
	static void test1() {
		System.out.println("Running test() method");
	}
	
	abstract void test();
	
}
