package regularExpression;

import java.util.regex.*;

public class StringContain_abc {

	public static void main(String[] args) {
		String s="abc222djnfffdsdk";
		Pattern p = Pattern.compile(".*abc.*");
		Matcher m = p.matcher(s);
		boolean ans = m.matches();
		System.out.println(ans);
	}

}
