package ArrayString;

public class InsertOperatorAndDoOperation {
	public static int check(int[] num,String str) {
		int res = num[0];
		int j=0;
		for(int i=1;i<=num.length-1;i++) {
			if(str.charAt(j)=='+') {
				res = res+num[i];
			}
			else if(str.charAt(j)=='-') {
				res = res-num[i];
			}
			else if(str.charAt(j)=='*') {
				res = res*num[i];
			}
//			else if(str.charAt(j)=='%') {
//				res = res%num[i];
//			}
			else  {
				res = res/num[i];
			}
			j++;
			
			if(j<=str.length()-1 && i == num.length-1) {
				i=-1;
			}
			if(j==str.length()) {
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] num= {10,20,30,10,15,20};
		System.out.println(check(num,"+"));
		
	}

}
