package Revision;

import java.util.TreeSet;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person(1,"a",21);
		Person p2 = new Person(2,"b",23);
		Person p3 = new Person(3,"c",22);
		
		TreeSet<Person> t1 = new TreeSet<Person>(age);
		
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		System.out.println(t1);
		for(Person p:t1) {
			System.out.println(p.age);
		}
	}

}
