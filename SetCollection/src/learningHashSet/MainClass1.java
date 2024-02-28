package learningHashSet;

import java.util.HashSet;

public class MainClass1 {

	public static void main(String[] args) {
		
		HashSet s1 = new HashSet();
		
		s1.add(100);
		s1.add("test");
		s1.add(2.5);
		s1.add(true);
		s1.add(null);
		
		System.out.println("Total elements in set: "+s1.size());
		System.out.println(s1);
		System.out.println("Adding duplicate elements: ");
		s1.add(100);//set doesn't allow duplicate elements
		s1.add(null);
		System.out.println("Total elements in set: "+s1.size());
		System.out.println(s1);
	}

}
