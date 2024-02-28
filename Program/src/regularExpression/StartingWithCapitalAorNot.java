package regularExpression;

import java.util.regex.*;


public class StartingWithCapitalAorNot {

	public static void main(String[] args) {
		String s="Apple";
		Pattern p = Pattern.compile("A.*");
		Matcher m = p.matcher(s);
		boolean ans = m.matches();
		System.out.println(ans);

	}

}
