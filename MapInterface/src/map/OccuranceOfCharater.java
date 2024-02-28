//Write a java program to find the occurance of each char using map.
//"hello"
//h-1
//e-1
//l-2
//o-1
package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccuranceOfCharater {
	
	public static void main(String[] args) {
//1.
//		String s ="hello hi bye welcome";
//		LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<Character,Integer>();
//		for(int i=0;i<s.length();i++) {
//			if(h1.containsKey(s.charAt(i))) {
//				h1.put(s.charAt(i), h1.get(s.charAt(i))+1);
//			}
//			else {
//				h1.put(s.charAt(i),1);
//			}
//		}
//		System.out.println(h1);

//2.
		String s ="hello hi bye welcome";
		LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(h1.containsKey(s.charAt(i))) {
				h1.put(s.charAt(i), h1.get(s.charAt(i))+1);
			}
			else {
				h1.put(s.charAt(i),1);
			}
		}
		for(Character ele:h1.keySet()) {
			System.out.println(ele+"-"+h1.get(ele));
		}
	}

}
