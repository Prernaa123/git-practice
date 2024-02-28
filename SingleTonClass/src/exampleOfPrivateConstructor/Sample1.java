package exampleOfPrivateConstructor;

public class Sample1 {
	private Sample1() {
		System.out.println("running Sample1 constructor");
	}
	public static Sample1 getInstance() {
		Sample1 s1 = new Sample1();
		return s1;
	}
}
