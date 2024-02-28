//ram is good
//output-> raM iS gooD

package Revision;

public class LastLetterCapital {

	public static void main(String[] args) {
		String s = "ram is good";
		char ch[] = s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if((i==ch.length-1 && ch[i]!=' ')||(ch[i]!=' ' && ch[i+1]==' ')) {
				count++;
				
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
				else if(ch[i]>='A' && ch[i]<='Z') {
					ch[i]=(char)(ch[i]+32);
				}
				
					
				}
			}
		System.out.println(count);
		System.out.println(ch);

			
		}
		
	
}

