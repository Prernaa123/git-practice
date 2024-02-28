package Revision;

public class AlphaNumeric {

	public static void main(String[] args) {
		char c ='a';
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			System.out.println("Alpha");
		}
		else if(c>='0' && c<='9') {
			System.out.println("numeric");
		}
		else {
			System.out.println("special character");
		}
	}

}
