package Revision;

public class NestedIf {

	public static void main(String[] args) {
		int n=0;
		if(n>0) {
			System.out.println("No. is Positive");
			if(n%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else if(n<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Neutral");
		}

	}

}
