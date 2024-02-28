package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartWithbOrB {

	public static void main(String[] args) {
		String s = "Boat";
		Pattern p = Pattern.compile("[B,b].*");
		Matcher m = p.matcher(s);
		boolean ans = m.matches();
		System.out.println(ans);
	}

}
