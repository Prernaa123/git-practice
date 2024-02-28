package oops1;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Ram",25000.0);
			System.out.println(e1.getEname());
			
			System.out.println(e1.getId());
			System.out.println(e1.getSalary());
			
			e1.setEname("Shashi");
			System.out.println(e1.getEname());

	}

}
