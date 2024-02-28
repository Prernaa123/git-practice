//merge two  sorted array to one sorted array
//arr1->[4,9,12,13]
//arr2->[3,6,8,10,15,16]
//o/p->[3,4,6,8,9,10,12,13,15,16]
//complexity->o(nlogn)


package Sorting;

public class MergeTwoSortedArray {
	static int[] merge(int[] arr1,int[] arr2) {
		int arr3[] = new int[arr1.length+arr2.length];//size=10
		int l=0,r=0,i=0;
		while(l<arr1.length && r<arr2.length) {
			if(arr1[l]<arr2[r]) {
				arr3[i]=arr1[l];
				l++;
			}
			else {
				arr3[i]=arr2[r];
				r++;
			}
			i++;
		}
		if(r<arr2.length) {
			while(r<arr2.length) {
				arr3[i]=arr2[r];
				i++;r++;
			}
		}
		else {
			while(l<arr1.length) {
				arr3[i]=arr1[l];
				i++;l++;
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		int arr1[] = {4,9,12,13};
		int arr2[] = {3,6,8,10,15,16};
		int[] ans = merge(arr1,arr2);
		for(int ele:ans) {
			System.out.print(ele+" ");
		}
	}
}
