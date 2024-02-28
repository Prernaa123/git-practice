package TreeSet;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int hashCode() {
		return this.id;
	}
	public boolean equals(Object arg) {
		return this.hashCode() == arg.hashCode();
	}
	
	public String toString() {
		return "Employee[id="+id+", name= "+name+",salary= "+salary+"]";
	}
	public int compareTo(Employee o) {
		return (int)(this.salary-o.salary);
	}
}
