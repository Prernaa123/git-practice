package Array;

import java.util.Scanner;

public class ReplaceElementBySumOFNextEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] =  new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i]+arr[i+1];
		}
		arr[arr.length-1]=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
