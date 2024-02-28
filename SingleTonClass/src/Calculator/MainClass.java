package Calculator;

public class MainClass {

	public static void main(String[] args) {
		Calculator c1 = Calculator.getInstance();
		System.out.println(c1);
		Calculator c2 = Calculator.getInstance();
		System.out.println(c2);
		Calculator c3 = Calculator.getInstance();
		System.out.println(c3);
		 c1.divide(12,2);
		 c2.divide(100,10);
		 c3.divide(20,5);

	}

}
