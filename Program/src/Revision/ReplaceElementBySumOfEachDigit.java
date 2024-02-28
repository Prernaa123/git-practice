package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementBySumOfEachDigit {

	public static void main(String[] args) 
		 {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the Length");
			int n = scn.nextInt();
			int x[] = new int[n];
			System.out.println("Enter the array Elements");
			
			
			for(int i=0;i<n;i++)
			{
				x[i] = scn.nextInt();
			}
			boolean rs[] = new boolean[x.length];
			
			
			for(int i=0;i<x.length;i++)
			{
				int a = x[i];
				int sum =  0;
				while(a>0)
				{
					int r = a%10;
					sum = sum + r;
					a=a/10;
				}
				x[i] = sum;
			}
			System.out.println(Arrays.toString(x));	
	    }
	}


