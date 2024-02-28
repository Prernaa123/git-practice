package ArrayString;

import java.util.Arrays;

public class ConvertCharToString {

	public static void main(String[] args) {
//1.
//		char[] arr= {'a','w','e','s','o','m','e'};
//		String s="";
//		for(int i=0;i<arr.length;i++) {
//			s=s+arr[i];
//		}
//		System.out.println(s);
		
//2.		
		char[] arr= {'a','w','e','s','o','m','e'};
		String s= new String(arr);//Char of array to String
		System.out.println(s);//awesome
//3.This is not working as per requirement		
//		String res=Arrays.toString(arr);// "[a,w,e,s,o,m,e]"->direct array to string
//		System.out.println(res);//[a,w,e,s,o,m,e]
    }

}
