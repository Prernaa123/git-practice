//WAJP to check given string is panagram or managram
package interviewClass;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {
		String s ="SQWERTYUIOPADFGHJKLMNBVCXZqwertyuiopasdfghjklmnbvcxz";		
		s = s.toLowerCase();
		
		HashSet s1 = new HashSet();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				s1.add(s.charAt(i));
			}
		}
		if(s1.size()==26) {
			System.out.println("Panagram");
		}else {
			System.out.println("Not a Panagram");
		}
	}

}
