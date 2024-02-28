package twoDArray;

public class TwoDArray {

	public static void main(String[] args) {
//1.
//		int[][] arr= {{1,2,3},{4,5,6,8},{7,9}};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j< arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//2. Using Advance For loop or for each loop
		int[][] arr= {{1,2,3},{4,5,6,8},{7,9}};
		for(int[] ele:arr) {
			for(int ele1:ele) {
			System.out.print(ele1+" ");
		}
System.out.println();
	}

}
}