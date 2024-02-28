package Revision;

public class CountVowel {
public static void main(String[] args) {
	String s = "Hello guys how are you";
	s=s.toLowerCase();
	int count = 0;
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u') {
			count++;
		}
	}
	System.out.println("Vowel: "+count);
}
}
