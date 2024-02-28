//Check whether sum of two element is equal to given sum
//n-->5
//[7,8,1,16,100]
//sum=108
//o/p = 8,100

//n-->6
//[1,7,100,8,17]
//sum=23
//o/p=-1
package foreachLoop;

public class SumOfTwoElements {

	public static void main(String[] args) {
//1.
//		int[] arr= {10,20,30,40,50};
//		int sum=30;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]+arr[j]==sum) {
//					System.out.println(arr[i]+" "+arr[j]);
//					return;
//				}
//	}
//			System.out.println("-1");
//			break;
//			}
//		}	
		
//2.
//		int arr[]= {1,7,100,8,17};
//		int sum=8;
//		int flag=checks(sum,arr);
//		if(flag==-1) {
//		System.out.println(flag);
//		}
//	}
//	static int checks(int sum,int arr[])
//	{
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]+arr[j]==sum) {
//					System.out.println(arr[i]+" "+arr[j]);
//					return 0;
//				}
//			}
//		}
//		return -1;
//	}

//3.
	int[] arr= {7,8,1,16,100};
	int sum=108;
	boolean f=false;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+","+arr[j]);
				f=true;
				break;
			
			}
		}
	}
	if(f==false) {
		System.out.println(-1);
	}
}
}
