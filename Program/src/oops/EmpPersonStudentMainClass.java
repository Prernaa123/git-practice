package oops;

public class EmpPersonStudentMainClass {

	public static void main(String[] args) {
		System.out.println("main method started");
		Person p1=new Person(21,"Shashi",'M');
		Employee e1=new Employee(22,"Suresh",'M',2121,25000.00,1.5);
		Student st1= new Student("Jaggesh",17,'M',1001,"NIST",99.99);
		
		p1.details();
		e1.details();
		st1.details();
		System.out.println("main method ended");
		
	}

}
