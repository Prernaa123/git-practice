package interviewClass;

import java.util.Scanner;

public class ArrayFrequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the element in array");
		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
		}
		arrFreq(x);
	}
	public static void arrFreq(int x[]) {
		
		boolean rs[] = new boolean[x.length]; // boolean array
		
		for(int i=0;i<x.length;i++) {
			if(rs[i]==false) {
				int count = 1;
		
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					count++;
					rs[j]=true;
				}
			}
			System.out.println(x[i]+"-->"+count);
		}
		}	
	}

}
