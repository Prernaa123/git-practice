package Array_2D;

import java.util.Scanner;

public class CompareDiagonalSum {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int row=ip.nextInt();
		int col = ip.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ip.nextInt();
			}
		}
		int lsum=0, rsum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					lsum=lsum+arr[i][j];
				}
				if(i+j==arr.length-1) {
					rsum = rsum+arr[i][j];
				}
			}
		}
		if(lsum > rsum) {
			System.out.println("left diagonal");
		}
		else {
			System.out.println("right diagonal");
		}

	}

}
