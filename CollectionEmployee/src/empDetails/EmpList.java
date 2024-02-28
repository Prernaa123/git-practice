package empDetails;

import java.util.ArrayList;
import java.util.Collections;

public class EmpList {

	public static void main(String[] args) {
		
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee("shashi",15500.0,25,"dev",3200468));
		l1.add(new Employee("Prerna",15506.0,20,"fe",5000468));
		l1.add(new Employee("Sushant",15508.0,29,"be",3205468));
		l1.add(new Employee("abcd",25500.0,25,"se",5200468));
		l1.add(new Employee("biku",18500.0,26,"dev",5205468));
		l1.add(new Employee("shristi",19500.0,25,"se",82215468));
		
		Collections.sort(l1);
		System.out.println("=============Sort=========");
		for(Employee ele:l1) {
			System.out.println(ele);
		}
		EmpSortBySal s1 = new EmpSortBySal();
		Collections.sort(l1,s1);
		System.out.println("============Sort==========");
		for(Employee ele:l1) {
			System.out.println(ele);
		}
		Collections.sort(l1);
		System.out.println("=============Sort=========");
		for(Employee ele:l1) {
			System.out.println(ele);
		}
		EmpByDesgn d1 = new EmpByDesgn();
		Collections.sort(l1,s1);
		System.out.println("============Sort==========");
		for(Employee ele:l1) {
			System.out.println(ele);
		}
	}

}
