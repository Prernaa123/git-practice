package stringTopic;

public class SumOfDigitInString {

	public static void main(String[] args) {
		String s="hjg56432gh534";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0'&& c<='9') {
				int n=c-48;//Ascci code of 0=48 and 9=57
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
