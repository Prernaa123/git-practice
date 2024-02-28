//ram is good
//o/p- Ram Is Good


package Revision;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String s = "ram is good";
		char ch[] = s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if((i==0 && ch[i]!=' ') || (ch[i]!=' ' && ch[i-1]==' ')){
				count++;
				
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
				else if(ch[i]>='A' && ch[i]<='Z') {
					ch[i]=(char)(ch[i]+32);
				}
			}
			
		}
		System.out.println("count "+count);
		System.out.println(ch);
//We can store the Char int String and print
		String s1 = new String(ch);
		System.out.println(s1);
	}

}
