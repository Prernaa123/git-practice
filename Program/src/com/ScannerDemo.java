package com;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("ENTER THE n1: ");
		int n1 = ip.nextInt();
		
		System.out.println("Enter the n2: ");
		int n2 = ip.nextInt();
		
		System.out.println("Sum:"+(n1+n2));
		

	}

}
