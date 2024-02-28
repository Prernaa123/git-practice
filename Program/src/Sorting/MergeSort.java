package Sorting;

public class MergeSort { 
	public static void conquer(int[] arr,int si,int mid,int ei) {
		int merged[] = new int[ei-si+1];//creating new array for merge ele
		int idx1=si;//first array start with starting index
		int idx2=mid+1;//first array start with mid+1 index that is starting index for 2nd array
		int x=0;//pointing merged element index
		
		while(idx1 <= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
				//merged[x] = arr[idx1];
				//x++;idx1++;
			}
			else {
				merged[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid) //loop for left out element
		{
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= ei) //loop for left out element
		{
			merged[x++] = arr[idx2++];
		}
		for(int i=0, j=si; i<merged.length; i++, j++) //replace the old array(arr) with new array(merged)
		{
			arr[j] = merged[i];
		}
	}
	public static void divide(int[] arr,int si,int ei) {
		if(si >= ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);//ei=mid
		divide(arr,mid+1,ei);//si=mid+1
		conquer(arr,si,mid,ei);
		
	}

	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		int n = arr.length;
		
		divide(arr,0,n-1);
		
		//print
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		

	}

}
