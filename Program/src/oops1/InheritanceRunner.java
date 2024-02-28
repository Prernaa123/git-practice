package oops1;

class GrandFather {
			void house() {
			System.out.println("1 bhk");
		}
	}

 class Father extends GrandFather{
	@Override
	void house() {
		System.out.println("2 bhk");
	}
	void computer() {
		System.out.println("4 gb Ram Computer");
	}
}

 class Son extends Father{
	 void house() {
			System.out.println("3 bhk");
		}
		void computer() {
			System.out.println("16 gb Ram Computer");
		}
		void laptop() {
			System.out.println("Apple Laptop");
		}
 }
 public class InheritanceRunner{
	 public static void main(String[] args) {
		 System.out.println("main method started");
		GrandFather gf = new GrandFather();
		gf.house();
		
		Father f1 = new Father();
		f1.house();
		f1.computer();
		
		Son s1 = new Son();
		s1.house();
		s1.computer();
		s1.laptop();
		
		System.out.println("main method ended");
	}
 }