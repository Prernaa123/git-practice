package learningMap;

import java.util.HashMap;

public class HashpMAP1 {

	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		m1.put(123,"test");
		m1.put(58.6, true);
		m1.put(false,null);
		m1.put('t', 3423);
		
		int n = m1.size();
		System.out.println(n);
		System.out.println(m1);
		Object e1=m1.get('t');
		System.out.println("value associated to 't' is "+e1);
		System.out.println("adding duplicate key");
		m1.put(58.6, false);
		System.out.println(m1);
		m1.remove(123);
		System.out.println("removed elementis: "+m1);

	}

}
