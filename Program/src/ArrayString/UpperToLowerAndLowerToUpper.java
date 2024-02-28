//String  ="ab56HJk##KKI"
//o/p ---> "AB56hjK##kkL"

package ArrayString;
public class UpperToLowerAndLowerToUpper {

	public static void main(String[] args) {
		String s ="ab56HJk##KKI";
		String ans=""; //using "" for concatation
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c>='A' && c<='Z')
			{
				c+=32;
			}
			else if(c>='a' && c<='z')
			{
				c-=32;
			}
			ans=ans+c;
		}
		System.out.println(ans);

	}

}
