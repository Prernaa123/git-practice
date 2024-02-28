package ArrayString;

public class Program1 {

	public static void main(String[] args) {
		String s= "a3b4a2d5";
		for(int i=0;i<s.length();i=i+2) {
			char c = s.charAt(i);
			int n = s.charAt(i+1)-48;//ascii value of 3 is 
			for(int j=1;j<=n;j++) {
				System.out.print(c);
			}
		}

	}

}
