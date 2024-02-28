package MemoryAreaOfJVM;

public class Aexception {

	public static void main(String[] args) {
		System.out.println("main method started");
		ArithmeticException e1 = new ArithmeticException();
		ArithmeticException e2 = new ArithmeticException("hi");
		String s1 = e1.getMessage();
		String s2 = e2.getMessage();
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
