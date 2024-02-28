package Array;
import java.util.Scanner;
public class SumOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			//arr[0] = 10  //10 is inserting at index 0
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
