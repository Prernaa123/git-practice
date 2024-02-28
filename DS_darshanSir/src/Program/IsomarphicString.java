//s1 -> "aabcc"
//s2 -> "xxyzz"
//o/p -> isomarphic

//s1->ppoootjjk
//s2 -> llhhhgddm
//o/p-> isomarphic

//s1->kkllhhnn
//s2 -> jjhhdhhh
//o/p -> not a isomarphic
package Program;

public class IsomarphicString {
//we are counting the number of alphabet
	static String countSqFreq(String s) {
		s=s+" ";//giving extra space at last->[a,a,b,c, ]->one space after c
		String ans ="";
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				ans=ans+c;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "xxyzz";
		if(countSqFreq(s1).equals(countSqFreq(s2))) {
			System.out.println("Isomarphic");
		}
		else {
			System.out.println("Not Isomarphic");
		}

	}

}
