package oops;

public class Employee extends Person {
	
		int id;
		double exp;
		double salary;
		
	public Employee(int age,String name,char gender,int id,double exp,double salary)
		{
			super(age,name,gender);
			this.id=id;
			this.exp=exp;
			this.salary=salary;
			
		}
	void details()
	{
		System.out.println(" Name: "+name+" Age: "+age+" Gender: "+gender+" Id: "+id+" Experience: "+exp+" Salary "+salary);
	}
	
}
