package Array;

import java.util.Scanner;

public class RepalceByLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] =  new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<max) {
				arr[i]=max;
			}
			else {
				max=arr[i];
				arr[i] = -1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
