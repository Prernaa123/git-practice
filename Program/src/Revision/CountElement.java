package Revision;

import java.util.Scanner;

public class CountElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the array element");
		
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		boolean rs[] = new boolean[x.length];
		
		for(int i=0;i<x.length;i++) 
		{
			if(rs[i]==false)
			{
				int c=1;
				for(int j=i+1;j<x.length;j++) {
					if(x[i]==x[j]) {
						c++;
						rs[j]=true;
					}
				}
				System.out.println(x[i]+"-->"+c);
//				if(c==1) {//for unique element
//					System.out.println(x[i]);
//				}
			}
		}
	}

}
