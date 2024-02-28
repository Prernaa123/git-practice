package twoDArray;

public class count {
	public static void main(String[] args) {
		
	
	String s="AAAAAABBBLBBCCCAAAFFFEEEKKKK";
	s=s+" ";
	int c=1;
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			c++;
		}
		else {
			System.out.print(s.charAt(i)+""+c);
			c=1;
		}
	}
}
}