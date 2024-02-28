package threads;

public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Sequence3 s1 = new Sequence3();
		s1.start();
		System.out.println("main method ended");

	}

}
