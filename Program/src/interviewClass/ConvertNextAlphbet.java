package interviewClass;

public class ConvertNextAlphbet {

	public static void main(String[] args) {
		String s = "abDE67HsqZk";
		String ans = "";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='z') 
			{
				ans = ans+'a';
			}
			else if(c=='Z')
			{
				ans=ans+'A';
			}
			else if((c>='a'&&c<='z')||(c>='A'&& c<='Z'))
			{
				c+=1;
				ans=ans+c;
			}
			else
			{
				ans=ans+c;
			}
		}
		System.out.println(ans);
	}

}
