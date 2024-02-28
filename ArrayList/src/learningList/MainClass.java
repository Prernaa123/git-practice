package learningList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Pen p1= new Pen("cello","Black",25.00);
		Employee e1 = new Employee(3241,"Ramesh",2500.00);
		NoteBook b1 = new NoteBook("classmate",100,20.00);
		Student st1 = new Student(21,"krish",45.00);
		
		ArrayList l1 = new ArrayList();
		l1.add(p1);
		l1.add(e1);
		l1.add(b1);                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		l1.add(st1);
		l1.add(p1);
		
		int n=l1.size();
		System.out.println("Total Elements: "+n);
		
		for(Object element:l1) {
			if(element instanceof Employee) {
				
			}
			System.out.println(element);
			
		}
		if(l1.get(0).equals(l1.get(4))) {
			System.out.println("Duplicate Pen objects");
		}
	}

}
