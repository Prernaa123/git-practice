package stringTopic;

public class CountVowelFromString {

	public static void main(String[] args) {
		String s="HELLO SHASHI BHUSHAN";
		s=s.toLowerCase();
		int v=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c=='a' || c=='e'||c=='i'||c=='o' || c=='u') {
				v++;
			}
		}
		System.out.println("Vowel:"+v);
	}

}
