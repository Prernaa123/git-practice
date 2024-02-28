package interviewClass;

public class MinElementArray {

	public static void main(String[] args) {
		int arr[] = {7,22,33,8,26,31};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
