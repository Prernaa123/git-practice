package empDetails;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	 String ename;
	 double esal;
	 int eage;
	 String edesgn;
	 long ephno;
	
	public Employee(String ename, double esal, int eage, String edesgn, long ephno) {
		
		this.ename = ename;
		this.esal = esal;
		this.eage = eage;
		this.edesgn = edesgn;
		this.ephno = ephno;
	}

	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esal=" + esal + ", eage=" + eage + ", edesgn=" + edesgn + ", ephno="
				+ ephno + "]";
	}


	@Override
	public int compareTo(Employee o) {
		
		return this.ename.compareTo(o.ename);
	}
}
class EmpSortBySal implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.esal==o2.esal) {
			return o1.ename.compareTo(o2.ename);
		}
		else if(o1.esal > o2.esal) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class EmpByDesgn implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.edesgn.compareTo(o2.edesgn);
	}
	
}
