package MemoryAreaOfJVM;

 class Demo1 {
	static int x=100;
	int y=100;
	static void test() {
		System.out.println("Running test method");
	}
	void display()throws Exception {
		System.out.println(100/0);
	}
}
 class MainClass1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("x value is"+Demo1.x);
		Demo1.test();
		Demo1 d1=new Demo1();
		System.out.println("y value is"+d1.y);
		try{
			d1.display();
		}
		catch (Exception e) {
			System.out.println("Exception Handle");
		}
		System.out.println("Main method ended");

	}

}
