package interviewClass;

public class MaxElementArray {

	public static void main(String[] args) {
		int arr[]= {7,22,33,8,26,31};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
