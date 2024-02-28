/* 2 3 4 5 6
   2 3 4 5 6
   2 3 4 5 6
   2 3 4 5 6
   2 3 4 5 6 */
package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}

	}

}
