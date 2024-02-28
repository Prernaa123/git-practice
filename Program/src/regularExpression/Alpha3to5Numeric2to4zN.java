package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alpha3to5Numeric2to4zN {

	public static void main(String[] args) {
		String s="jsdfjs#d23343";
		Pattern p=Pattern.compile("[a-z,A-Z]{3,5}#*[0-9]{2,4}.*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
