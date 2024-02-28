package Revision;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {//this loop for printing space
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				//for(int k=1;k<=st;k++)
				System.out.print("* ");
				//st=st+2;
			}
			System.out.println();
		}
	}

}
