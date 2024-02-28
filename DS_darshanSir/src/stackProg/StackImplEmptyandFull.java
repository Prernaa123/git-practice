package stackProg;

public class StackImplEmptyandFull {
	static int[] stack;
	static int top;
	
	static void  createStack(int size) {
		stack = new int[size];
		top=-1;
		System.out.println("Stack had been created with size:"+size);
	}static void  push(int ele) {
		if(top==stack.length-1) {
			System.out.println("Stack OverFlow.....!!!");
		}
		else {
			top++;
			stack[top]=ele;
			
			System.out.println(ele+" had been added successfully...!!");
		}
	}
	static void display() {
		System.out.println("=====Stack elements==========");
		if(top==-1) {
			System.out.println("Stack is Empty...!!!!");
		}
		else {
			for(int i=top;i>0;i--) {
				System.out.println(stack[i]);
			}
		}
	}
	static void pop() {
		if(top==-1) {
			System.out.println("Stack underFlow....!!!!");
		}
		else
		{
			System.out.println(stack[top]+"had been deleted...!!!");
			stack[top]=0;
			top--;
		}
	}
	static boolean isEmpty() {
		return top==-1;
	}
	static boolean isFull() {
		return top==stack.length-1;
	}
	public static void main(String[] args) {
		createStack(5);
		push(10);
		push(20);
		push(30);
		push(40);
		display();
		push(50);
		pop();
		push(60);
		display();
		push(100);
		push(50);
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		System.out.println(isEmpty());
		System.out.println(isFull());
		
	}	
}
