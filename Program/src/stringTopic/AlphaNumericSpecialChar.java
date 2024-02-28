//str->"h12e3ll%%o56@0##"
//o/p ->"helloo12356%%@##"
//first it should be alpha
//second it should be numeric
//third it should be special character

package stringTopic;

public class AlphaNumericSpecialChar {

	public static void main(String[] args) {
		String s ="h12e3ll%%o56@0##";
		String alpha ="",num="",sc="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
				alpha = alpha+c;
			}
			else if(c>='0'&& c<='9') {
				num=num+c;
			}
			else {
				sc=sc+c;
			}
		}
		System.out.println(alpha+num+sc);

	}

}
