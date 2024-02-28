package Revision;

import java.util.Scanner;

public class PatternG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int mid = n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			//if(j==1||i==1||i==n||j==n&&i>=mid||i==mid&&j>=mid) {
			if(i==1||j==1||i==n||j==n&&i>=n/2) {	
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			
		}
			System.out.println();
	}
		
   }
}
