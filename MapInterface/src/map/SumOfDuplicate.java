//WAJP to print sum of duplicate element using map

package map;

import java.util.LinkedHashMap;

public class SumOfDuplicate {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> h1 = new LinkedHashMap<Integer,Integer>();
		int[] arr = {10,20,30,10,60,55,22,20,77,65,60,10};
		for(int i=0;i<arr.length;i++) {
			if(h1.containsKey(arr[i])) {
				h1.put(arr[i], h1.get(arr[i])+1);
			}else {
				h1.put(arr[i],1);
				
			}
		}
		System.out.println(h1);
		int sum=0;
		for(Integer ele : h1.keySet()) {
			if(h1.get(ele)>1) {
				sum=sum+ele;
			}
		}
		System.out.println(sum);
	}

}
