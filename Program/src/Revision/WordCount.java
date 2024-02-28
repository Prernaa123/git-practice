package Revision;

public class WordCount {

	public static void main(String[] args) {
		String s = "Ram is good";
		int count = 0;
		char ch[] = s.toCharArray();//ch[R,a,m, ,i,s, ,g,o,o,d]
									//   0,1,2,3,4,5,6,7,8,9,10
		for(int i=0;i<ch.length;i++) 
		{
			if((i==0 && ch[i]!=' ') || (ch[i]!=' ' && ch[i-1]==' '))  //' ' ->space
			{
				count++;
			}
		}
		System.out.println(count);
		}
		

}
