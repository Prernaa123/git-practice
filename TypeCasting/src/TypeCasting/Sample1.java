package TypeCasting;

public class Sample1 {
	void test(Demo1 arg) {
		System.out.println("Run");
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.disp();
		arg.x =100;
		arg.y =200;
	}
}
