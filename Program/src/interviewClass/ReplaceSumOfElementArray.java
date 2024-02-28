package interviewClass;

public class ReplaceSumOfElementArray {

	public static void main(String[] args) {
		int arr[] = {1,4,7,2,3,8,12};
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i] = arr[i]+arr[i+1];
		}
			arr[arr.length-1]=0;
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
		}

	}


