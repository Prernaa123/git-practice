package Revision;

public class ClassLoadingMain {

	public static void main(String[] args) {
		System.out.println("main start");
		ClassLoading.hello();
		System.out.println("Main end");
	}
		static {
			System.out.println("BYE");
		}

	}


