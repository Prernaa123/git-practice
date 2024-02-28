package classLoading;

public class UsingforNameMethod {

	public static void main(String[] args) {
		System.out.println("main method starts");
		try {
			Class.forName("classLoading.Demo1");
		} catch (ClassNotFoundException e) {
			System.out.println("The class name is Incorrect");
		}
		//Demo1.hello();
		System.out.println("main ends");
	}
	static {
		System.out.println("TestLoading class is loaded into the JVM memory");
	}

}

class Demo1{
	public static void hello() {
		System.out.println("How are you?");
	}
	static {
		System.out.println("Demo class is loaded into the JVM memory");
	}
} 