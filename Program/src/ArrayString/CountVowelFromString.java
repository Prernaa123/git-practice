package ArrayString;

public class CountVowelFromString {

	public static void main(String[] args) {
		String s ="Hello Guys you are AWESOME";
		s=s.toLowerCase();
		int v=0;//counting vowel
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v++;
			}
		}
		System.out.println("Vowels: "+v);
		

	}

}
