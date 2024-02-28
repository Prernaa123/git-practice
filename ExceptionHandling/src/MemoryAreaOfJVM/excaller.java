package MemoryAreaOfJVM;

public class excaller {
public static void main(String[] args) {
	A a1 = new A();
	try{
		throw a1;
	}catch (Exception e) {
		System.out.println("hi");
	}
}
}
