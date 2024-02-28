package Revision;

public class Positive {

	public static void main(String[] args) {
		int n=23;
		if(n%11==0) {
			System.out.println("eleven");
		}
		else if(n%3==0) {
			System.out.println("Three");
		}
		else if(n%2==0){
			System.out.println("two");
		}
		else {
			System.out.println(-1);
		}

	}

}
