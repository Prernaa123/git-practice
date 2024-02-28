package Revision;

public class SwapStringLastCharacter {

	public static void main(String[] args) {
		String s = "Ram";
		char ch[] = s.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) {
			
			char temp = ch[i];//R
			ch[i] = ch[ch.length-1];//ch[2]->m
			ch[ch.length-1] = temp;
		}
		
		System.out.println(ch);
	}

}
