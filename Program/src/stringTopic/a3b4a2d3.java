//str ->"a3b4a2d3"
//o/p ->"aaabbbbaaddd"

package stringTopic;
public class a3b4a2d3 {

	public static void main(String[] args) {
		String s="a3b4a2d3";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int n =s.charAt(i+1)-48;
			for(int j=1;j<=n;j++) {
				
			}
			System.out.print(c);
		}

	}

}
