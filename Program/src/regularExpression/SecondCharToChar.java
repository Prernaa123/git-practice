package regularExpression;

import java.util.regex.*;

public class SecondCharToChar {

	public static void main(String[] args) {
		String s = "ABAC";
		Pattern p=Pattern.compile(".B.*");
		Matcher m=p.matcher(s);
		boolean ans = m.matches();
		System.out.println(ans);
		

	}

}
