package Array_2D;

import java.util.Scanner;

public class Create2DArrUserInput {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int row = ip.nextInt();//taking input for row
		int col = ip.nextInt();//taking input for col
		int[][] arr = new int[row][col];//creating 2D array
		for(int i=0;i<arr.length;i++) {//i-->static
			for(int j=0;j<arr[i].length;j++) {//j-->dynamic
				arr[i][j] = ip.nextInt();//inserting the element index wise
			}
		}
	//---------Above code for taking user Input--------------------
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
