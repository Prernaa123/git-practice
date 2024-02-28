package stackProg;

public class StackImpl {

		static int[] stack;
		static int top;
		
		static void  createStack(int size) {
			stack = new int[size];
			top=-1;
			System.out.println("Stack had been created with size:"+size);
		}
		public static void main(String[] args) {
			createStack(5);
	}

}
