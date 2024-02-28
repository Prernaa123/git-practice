package TreeSet;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"abc",250000.00);
		Employee e2 = new Employee(2,"pbc",260000.00);
		Employee e3 = new Employee(5,"abd",270000.00);
		Employee e4 = new Employee(4,"are",280000.00);
		Employee e5 = new Employee(3,"ubc",290000.00);
		
		TreeSet<Employee> s1 = new TreeSet();
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		
		System.out.println("Total elements: "+s1.size());
		System.out.println("TreeSet elements: ");
		System.out.println("--------------------------");
		System.out.println("ID\tName\tSalary");
		System.out.println("--------------------------");
		for(Employee emp:s1) {
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary);
		}
		System.out.println("main method ended");
	}
}
