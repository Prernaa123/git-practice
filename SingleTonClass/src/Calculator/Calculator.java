package Calculator;
//Singleton Class
public class Calculator { 

	
		private static Calculator calci;
		private Calculator() {
			System.out.println("Creating Calculator Instance");
		}
		public void divide(int n,int m) {
			System.out.println("Dividing " + n + " by " + m);
			int res = n/m;
			System.out.println(res);
		}
		public static Calculator getInstance() {
			if(calci == null) {
				calci = new Calculator();
			}
			return calci;
		}
}
