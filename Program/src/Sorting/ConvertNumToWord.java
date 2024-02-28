//number -> 1768
//o/p -> onesevensixeight

package Sorting;

public class ConvertNumToWord {

	public static void main(String[] args) {
		int n=1768;
		String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String ans="";
		while(n!=0) {
			ans=arr[n%10]+ans;
			n=n/10;
		}
	System.out.println(ans);

	}

}
