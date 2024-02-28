//{12,3,9,1,5,8,2}
//target -> 10
// o/p-> 9,1
//       8,2


package interviewClass;

public class TargetWithAddTwoEle {

	public static void main(String[] args) {
		int arr[] = {12,3,9,1,5,8,2,7};
		int target=10;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
