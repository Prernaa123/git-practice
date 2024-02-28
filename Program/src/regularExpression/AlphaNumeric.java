package regularExpression;

import java.util.regex.*;


public class AlphaNumeric {

	public static void main(String[] args) {
		String s="ghfaA";
		Pattern p=Pattern.compile("[a-z,A-Z,0-9].*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
