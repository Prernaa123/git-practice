package ArrayString;

public class CountHiFromString {

	public static void main(String[] args) {
		String s = "khi hi welcome hi hi";
		int c =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='h'&& s.charAt(i+1)=='i') {
				c++;
			}
		}
		System.out.println("Number of Hi is: "+c);

	}

}
