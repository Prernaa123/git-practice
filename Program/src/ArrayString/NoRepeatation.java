package ArrayString;

import java.util.Arrays;

public class NoRepeatation {

	public static void main(String[] args) {
		int[] arr = {12,6,1,9,6,14,56,12,18};
		Arrays.sort(arr);//sort array in ascending order
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
