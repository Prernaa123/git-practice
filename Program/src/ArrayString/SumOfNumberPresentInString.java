package ArrayString;

public class SumOfNumberPresentInString {
	
	public static int convert(String str) {
		int res = 0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				res = res+(str.charAt(i)-48);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(convert("as67@hyj25"));

	}

}
