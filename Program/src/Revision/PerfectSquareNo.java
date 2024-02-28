package Revision;

public class PerfectSquareNo {

	public static void main(String[] args) {

		
//1.		
//		int n=25;
//		int c=0;
//		for(int i=1;i<=n;i++) {
//			if(n==i*i) {
//				c++;
//				break;
//			}
//		}
//		if(c==1) {
//			System.out.println("Perfect Square");
//		}
//		else {
//			System.out.println("Not a Perfect Square");
//		}
		
//2.
		boolean flag = false;
		int n=5;
		for(int i=1;i<=n;i++) {
			if(n==i*i) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("perfect square");
		}
		else {
			System.out.println("Not a Perfect square");
		}
	}

}
