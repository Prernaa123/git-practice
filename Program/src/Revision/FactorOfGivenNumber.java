package Revision;

public class FactorOfGivenNumber {

	public static void main(String[] args) {
		int n=8;
		int  count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count = count+1;
			}
		}
		System.out.println(count);

	}

}
