//print maximum common pre-fix
//str1->"abcdefgh"
//str2->"abctghj"
//o/p->abc

//str1->"hellohowareyou"
//str2->"heisgoodboy"
//o/p->he

//str1 ->"apple"
//str2->"aeroplane"
//o/p -> a

//str1 ->"kisaghdi"
//str2 ->"kisbad"
//o/p-> kis


package ArrayListProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MaximumPrefix {

	public static void main(String[] args) {
		String s1 ="xyz";
		String s2="xyzxayxabcd";
		String ans="";
		int n = s1.length()>s2.length()?s2.length():s1.length();
		for(int i=0;i<n;i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				ans=ans+s1.charAt(i);
			}
			else {
				break;
			}
		}
		System.out.println(ans.length()==0?-1:ans);
	}

}
