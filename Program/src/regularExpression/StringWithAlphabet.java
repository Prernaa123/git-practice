package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWithAlphabet {

	public static void main(String[] args) {
		String s="ghfaA";
		Pattern p=Pattern.compile("[a-z,A-Z].*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
	}

}
