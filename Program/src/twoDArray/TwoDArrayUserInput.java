package twoDArray;
import java.util.Scanner;
public class TwoDArrayUserInput {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int row = ip.nextInt();
		int col = ip.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0;i<arr.length;i++) {//row
			for(int j=0; j<arr[i].length;j++) {//col
				arr[i][j] = ip.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}