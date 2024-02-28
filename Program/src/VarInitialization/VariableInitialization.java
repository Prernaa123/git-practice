package VarInitialization;

public class VariableInitialization {

	static int a=10;//Direct Initialization
	int b;
	int c;
	int d;
	int e;
	{
		this.c=30;//Block Initialization
	}
	public VariableInitialization(int d)
	{
		this.d=d;//Constructor Initialization
	}
	public void m1(int e) {
		this.e =e; //Method Initialization
	}
	public static void main(String[] args) {
		VariableInitialization v = new VariableInitialization(40);
		v.b=20;//Reference Object Initialization
		System.out.println(a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		v.m1(10);
		System.out.println(v.e);
		
		
		

	}

}
