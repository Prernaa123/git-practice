//for any number of matrix use arr[i].length in inside array

package Array_2D;

public class ForAnyNoOfMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6,7,9,5},{7,9}};
		
		for(int[] ele:arr) {
			for(int item:ele) {
				System.out.print(item+" ");
			}
			System.out.println();
		}

	}

}
