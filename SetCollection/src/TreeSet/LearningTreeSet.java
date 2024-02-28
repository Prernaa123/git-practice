package TreeSet;

import java.util.TreeSet;

public class LearningTreeSet {

	public static void main(String[] args) {
		TreeSet s1 = new TreeSet();
		s1.add(25);
		s1.add(12);
		s1.add(35);
		s1.add(10);
		s1.add(5);
		
		System.out.println("Total Elements: "+s1.size());
		System.out.println("TreeSet Elements:");
		System.out.println(s1);
		for(Object element:s1) {
			System.out.println(element);
		}
		System.out.println("main method ended");
	}

}
