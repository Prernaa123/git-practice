package Revision;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abc";
		String rev = "";
//1.		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
/*2.		for(int i=0;i<s.length();i++) //i<=s.length()-1
		{
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev); */
		
//3.	System.out.println(new StringBuffer(s).reverse());

	}

}
