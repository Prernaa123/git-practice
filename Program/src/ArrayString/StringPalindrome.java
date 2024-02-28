package ArrayString;

public class StringPalindrome {

	public static void main(String[] args) {
		String s1 = "level";
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("String 1 is: "+s2);
		System.out.println("String 2 is: "+s1);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
