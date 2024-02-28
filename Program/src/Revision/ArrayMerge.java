package Revision;

import java.util.Arrays;

//Merge two array

public class ArrayMerge {

	public static void main(String[] args) {
		
		int x[] = {1,2,3};
		int y[] = {10,20,30};
		
		int z[] =new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			z[i+x.length]=y[i];
		}
		System.out.println(Arrays.toString(z));
	}

}

