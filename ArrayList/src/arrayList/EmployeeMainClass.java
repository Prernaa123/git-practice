package arrayList;

import java.util.ArrayList;

public class EmployeeMainClass {

	public static void main(String[] args) {
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		//Employee e = new Employee()
		
		l1.add(new Employee(123,"Rahul",5000,"Engineer",12345));
		l1.add(new Employee(123,"Shashi",4000,"SoftwareEngineer",12345));
		l1.add(new Employee(123,"Prerna",10000,"CloudEngineer",12345));
		l1.add(new Employee(123,"Sushant",3000,"SystemEngineer",12345));
		l1.add(new Employee(123,"Chandan",9000,"WaterEngineer",12345));
		l1.add(new Employee(123,"Simran",8000,"FieldEngineer",12345));
		
		double max=l1.get(0).getEsal();
		for(Employee ele:l1) {
			if(max<ele.getEsal()) {
				max=ele.getEsal();
			}
		}
		for(Employee ele:l1) {
			if(max==ele.getEsal()) {
				System.out.println(ele);
			}
		}
	}

}
