package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alpha3Numeric4 {

	public static void main(String[] args) {
		String s="6851245441";
		Pattern p=Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
	}

}
