package classLoading;
 class Demo{
	public static void hello() {
		System.out.println("How are you?");
	}
	static {
		System.out.println("Demo class is loaded into the JVM memory");
	}
}
public class TestLoading {

	public static void main(String[] args) {
		System.out.println("main starts");
		Demo.hello();
		System.out.println("main ends");
	}
	static {
		System.out.println("TestLoading class is loaded into the JVM memory");
	}

}
