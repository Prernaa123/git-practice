package Array;
import java.util.Scanner;
public class ArrayElement {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int size = sc.nextInt();
//		int[] arr = new int[size];//creating array size-->5   [0,0,0,0,0]
//		for(int i=0;i<arr.length;i++) { //index starting with zero
//	  //i=0,0<5 ---True
//			arr[i]=sc.nextInt();//inserting the element index wise
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"");//traversing and printing element whatever stored in arr[i]
//		}
		int[] arr = {10,20,30};
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"->"+arr[i]);
		}
	}

}
