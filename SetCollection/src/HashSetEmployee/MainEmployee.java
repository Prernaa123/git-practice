package HashSetEmployee;

import java.util.HashSet;

public class MainEmployee {

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e1 = new Employee(25, "Shashi", 25000.00);
		Employee e2 = new Employee(26, "Shas", 26000.00);
		Employee e3 = new Employee(27, "Shash", 27000.00);
		Employee e4 = new Employee(28, "Shashib", 28000.00);
		Employee e5 = new Employee(29, "Shashis", 29000.00);
		
		HashSet<Employee> s1 = new HashSet();
		
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		
		System.out.println("Total Employee: "+s1.size());
		System.out.println("---------------------------");
		System.out.println("ID\tName\tSalary");
		System.out.println("----------------------------");
		for(Employee emp:s1) {
			System.out.println(emp.id +"\t"+emp.name+"\t"+emp.salary);
		}


	}

}
