package Revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Mainclass {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("SQL");
		l1.add("Spring");
		l1.add("Java");
		l1.add("html");
		l1.add("web");
		
		System.out.println("List elements : using normal loop");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		
		System.out.println("List elements: using for each loop");
		for(String element:l1) {
			System.out.println(element);
		}
		
		System.out.println("List elements: using Iterator");
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
		
		System.out.println("List elements in forward direction: Using ListIterator");
		
		ListIterator<String> listitr = l1.listIterator();
		while(listitr.hasNext()) {
			String element = listitr.next();
			System.out.println(element);
		}
		
		
		System.out.println("List elements in reverse direction: using listIterator");
		while(listitr.hasPrevious()) {
			String element = listitr.previous();
			System.out.println(element);
		}
		

	}

}
