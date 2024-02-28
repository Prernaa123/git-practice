package map;

import java.util.LinkedHashMap;

public class UseOfContainsKeyMethod {

	public static void main(String[] args) {
		LinkedHashMap<Character,String> h1 = new LinkedHashMap<Character,String>();
		h1.put('a', "apple");
		h1.put('j', "jspider");
		h1.put('q', "qspider");
		h1.put('p', "pyspider");
		System.out.println(h1.containsKey('a'));//true
		//containsKey(key) -> return true if that key is present otherwise returns false
		System.out.println(h1.containsKey('l'));//false
		System.out.println(h1.containsKey('q'));//true
		

	}

}
