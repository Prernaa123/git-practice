package MemoryAreaOfJVM;

public class excep {
public static void main(String[] args) {
	ArithmeticException e1 = new ArithmeticException();
	Object o1=new Object();
	A a1= new A();
	System.out.println(e1 instanceof Throwable);
	System.out.println(o1 instanceof Throwable);
	System.out.println(a1 instanceof Throwable);
}
}
