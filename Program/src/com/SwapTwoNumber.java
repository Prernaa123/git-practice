package com;

public class SwapTwoNumber {

	public static void main(String[] args) {
		System.out.println("Number beforer swapping : ");
		int a = 10, b=20;
		int temp=0;
		System.out.println(" a: "+a+" b: "+b);
		
		temp=b;
		b=a;
		a=temp;
		System.out.println("Number after swapping :");
		System.out.println(" a: "+a+" b: "+b);
		

	}

}
