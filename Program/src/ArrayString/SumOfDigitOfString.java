//Sum of Digit of String
//str="hjg56432gh534"
//o/p=32
//5+6+4+3+2+5+3+4

package ArrayString;
public class SumOfDigitOfString {

	public static void main(String[] args) {
		String s ="hjg56432gh534";
		int sum =0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				int n = c-48;
				sum = sum+n;//sum=sum+(c-48)
			}
		}
		System.out.println(sum);
	}

}
