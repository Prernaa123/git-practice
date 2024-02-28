package ArrayString;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		System.out.println("Array length is: "+arr.length);
		System.out.println("Giving value for first position: "+arr[0]);
		System.out.println("Giving value for Second position: "+arr[1]);
		System.out.println("Giving value for third position: "+arr[2]);
		
//		for(int i=0;i<arr.length;i++)
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(i+" ");
		}
	}

}
