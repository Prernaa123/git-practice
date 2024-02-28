package threads;

public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Sequence1 s1 = new Sequence1();
		s1.start();
		Sequence1 s2 = new Sequence1();
		s2.start();
		System.out.println("Main method ended");
	}

}
