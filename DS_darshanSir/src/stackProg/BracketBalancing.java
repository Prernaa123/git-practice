package stackProg;

public class BracketBalancing {
	static char[] stack;
	static int top=-1;
	
	static void push(char ele) {
			top++;
			stack[top]=ele;
	}
	static void pop() {
		top--;
	}

	public static void main(String[] args) {
		String s =")(())(())(";
		boolean flag = true;
		stack=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				push('(');
			}
			else if(s.charAt(i)==')' && top!=-1 && stack[top]=='(') {
				pop();
			}
			else {
				flag=false;
				break;
			}
		}
		if(top==-1 && flag==true) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("unbalanced");
		}
		
	}

}
