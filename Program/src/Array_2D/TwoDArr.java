package Array_2D;

public class TwoDArr {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,9},{4,5,6,2},{7,3,8,9},{1,2,3,4}};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}