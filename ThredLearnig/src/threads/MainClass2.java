package threads;

public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Sequence1 s1 = new Sequence1();
		System.out.println("Thread ID:"+s1.getId());
		System.out.println("Thread Name:"+s1.getName());
		System.out.println("Thread Priority:"+s1.getPriority());
		
		System.out.println("modifying thread properties");
		s1.setName("My Thread");
		s1.setPriority(10);

		System.out.println("Thread Name:"+s1.getName());
		System.out.println("Thread Priority:"+s1.getPriority());

	}

}
