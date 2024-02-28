package admin;

import repository.EmployeeDB;

public class MainClass {

	public static void main(String[] args) {
		EmployeeDB edb = new EmployeeDB(5);// this object has a array of Employee 
		Employee e1 =  EmployeeCreation.create("Ramesh",23300.00, 1.2);
		Employee e2 =  EmployeeCreation.create("Suresh",33300.00, 2.6);
		Employee e3 =  EmployeeCreation.create("Prerna",35300.00, 3.2);
		Employee e4 =  EmployeeCreation.create("Sushant",43300.00, 4.6);
		Employee e5 =  EmployeeCreation.create("Shashi",53300.00, 5.2);
		Employee e6 =  EmployeeCreation.create("Suresh",63300.00, 6.6);
		edb.addEmployee(e1);
		edb.addEmployee(e2);
		edb.addEmployee(e3);
		edb.addEmployee(e4);
		edb.addEmployee(e5);
		edb.addEmployee(e6);
		
		edb.viewEmployeeRecords();
		
		Employee e = edb.getEmployee(1002);
		System.out.println(e);
//		System.out.println(e1.getId());
//		System.out.println(e2.getId());

	}

}
