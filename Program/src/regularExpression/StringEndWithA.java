package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEndWithA {
	public static void main(String[] args) {
		String s="ghfaA";
		Pattern p=Pattern.compile(".*A");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
		
	}
}
