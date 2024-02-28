package TypeCast;

public class MainClass {

	public static void main(String[] args) {
		Demo1 d1 = new Demo2();
		System.out.println("");
		System.out.println(d1.x);
		d1.test();
		Demo2 d2 = (Demo2) d1;
		System.out.println(d2.x);
		System.out.println(d2.y);
		d2.test();
		d2.disp();
		
	}

}
