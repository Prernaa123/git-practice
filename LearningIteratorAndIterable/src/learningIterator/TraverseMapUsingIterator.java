//How to traverse Map element by using Iterator

package learningIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TraverseMapUsingIterator {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		HashMap<Integer,String> map1 = new HashMap();
		map1.put(101,"java");
		map1.put(102, "sql");
		map1.put(103,"web");
		map1.put(104,"spring");
		
		Set<Integer> set1 = map1.keySet();
		System.out.println(set1);
		
		Iterator<Integer> keyItr = set1.iterator();
		while(keyItr.hasNext()) {
			Integer keyelement = keyItr.next();
			String value = map1.get(keyelement);
			System.out.println(keyelement+"-->"+value);
		}
		System.out.println("main method ended");
		
	}

}
