package Array_2D;

import java.util.Scanner;

public class SumOfDiagonalELement {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int row = ip.nextInt();
		int col = ip.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ip.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					sum = sum+arr[i][j];
				}
			}
		}
		System.out.println("Sum is "+sum);
	}

}
