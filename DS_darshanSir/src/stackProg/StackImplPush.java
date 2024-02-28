package stackProg;

public class StackImplPush {

	
		static int[] stack;
		static int top;
		
		static void  createStack(int size) {
			stack = new int[size];
			top=-1;
			System.out.println("Stack had been created with size:"+size);
		}
		static void  push(int ele) {
			if(top==stack.length-1) {
				System.out.println("Stack OverFlow.....!!!");
			}
			else {
				top++;
				stack[top]=ele;
				
				System.out.println(ele+" had been added successfully...!!");
			}
		}
		public static void main(String[] args) {
			createStack(5);
			push(10);
			push(20);
			push(30);
			push(40);
			push(50);
			push(60);
			

	}

}
