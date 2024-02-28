package Revision;

public class CountAlphaNumSc {

	public static void main(String[] args) {
		String s = "idiots123@#";
		int alpha =0,num=0,sc=0;
		for(int i =0;i<s.length();i++) {
		char c = s.charAt(i);
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			alpha++;
		}
		else if(c>='0' && c<='9') {
			num++;
		}
		else {
			sc++;
		}
	}
		System.out.println("Aplha: "+alpha+"\nNum: "+num+"\nSC: "+sc);
	}
}
