package Array_2D;

import java.util.Scanner;

public class HighestRowSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int temp=0,ans=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum = sum+arr[i][j];
			}
			if(temp<sum) {
				temp=sum;
				ans=i;
			}
		}
		System.out.println("Highest row is "+row);
	}

}
