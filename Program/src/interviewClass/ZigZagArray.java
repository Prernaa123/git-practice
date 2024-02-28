//x[1,2,3] y[10,20,30]
//z[1,10,2,20,3,30]


package interviewClass;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of 1st array ");
		int n = sc.nextInt();
		int x[] = new int[n];
		
		System.out.println("Enter the 1st array element");
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the 2nd array");
		int m = sc.nextInt();
		int y[] = new int[m];
		
		System.out.println("Enter the 2nd array element");
		for(int i=0;i<m;i++) {
			y[i] = sc.nextInt();
		}
		
		int z[]=zigzag(x,y);
		System.out.println(Arrays.toString(z));
	}	
//		public static int[] zigzag(int x[],int y[])
//		{
//		
//		int z[] = new int[x.length+y.length];
//		
//		
//		int i=0;//for traversing x array element
//		int j=0;//for traversing y array element
//		int k=0;//for traversing z array element
		
//		while(i<x.length && j<y.length) {
//			z[k]=x[i];
//			k++;
//			z[k]=y[j];
//			k++;
//			i++;j++;
//		}
//		while(i<x.length) {
//			z[k]=x[i];
//			k++;i++;
//		}
//		while(j<y.length) {
//			z[k]=y[j];
//			k++;j++;
//		}
		
	public static int[] zigzag(int x[],int y[])
	{
		
		int z[] = new int[x.length+y.length];
		
		
		int i=0;//for traversing x array element
		int j=0;//for traversing y array element
		for(int k=0;k<z.length;k++) 
		{
			if(i<x.length)
		
				z[k++]=x[i++];
			
			if(j<y.length) 
				z[k]=y[j+1];
			
		}
		return z;
	}
}

