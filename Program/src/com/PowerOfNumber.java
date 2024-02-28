package com;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n values");
		int n = sc.nextInt();//2
		System.out.println("Enter the p values");
		int p = sc.nextInt();//3
		
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*n;
			
		}
		System.out.println(pow);
	}

}
