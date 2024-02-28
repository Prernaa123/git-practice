package stringTopic;

public class CountAlphaNumSpec {

	public static void main(String[] args) {
		String s="idiot#@%^*~!1234$";
		int alpha=0;
		int num=0;
		int sc=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
	
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			alpha++;
		}
		else if(c>='0'&&c<='9') {
			num++;
		}
		else {
			sc++;
		}
	}
	System.out.print(" Alpha "+alpha+" num "+num+" special char "+sc);
}}
