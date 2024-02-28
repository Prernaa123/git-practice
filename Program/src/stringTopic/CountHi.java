package stringTopic;

public class CountHi {

	public static void main(String[] args) {
		String s="hghibghifdghiaghihi";
		int c=0;
		for(int i=0;i<s.length()-1;i++) {
			s.charAt(i);
			if(s.charAt(i)=='h'&& s.charAt(i+1)=='i') {
				c++;
			}
		}
		System.out.println(c);
	}

}
