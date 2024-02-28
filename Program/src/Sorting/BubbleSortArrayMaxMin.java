package Sorting;

public class BubbleSortArrayMaxMin {

	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) { // ->desc order
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {12,4,1,324,121,54,18};
		sort(arr);
		System.out.println("1st max ele:"+arr[arr.length-1]);
		System.out.println("2nd max ele:"+arr[arr.length-2]);

		System.out.println("1st min ele:"+arr[0]);

		System.out.println("2nd min ele:"+arr[1]);
	}
}
