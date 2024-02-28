package Revision;

public class TaxiFare {

	public static void main(String[] args) {
		int km=5;
		if(km<=2) {
			System.out.println(30);
		}else if(km<=7) {
			System.out.println(30+(km-2)*15);
		}else if(km<=12) {
			System.out.println(105+(km-7)*20);
		}
		else {
			System.out.println(205+(km-12)*25	2a);
		}

	}

}
