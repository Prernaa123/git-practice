package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String s="abc123@gmail.com";
		Pattern p=Pattern.compile("[a-z,A-Z]{3,5}#*[0-9]{2,5}@gmail[.]com");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);

	}

}
