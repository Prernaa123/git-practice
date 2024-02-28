package serviceimpl;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	Scanner ip = new Scanner(System.in);
	ArrayList<Employee> l1 = new ArrayList<Employee>();
	@Override 
	public void addEmp() {//this is API
		
		System.out.println("Enter Employee Details:-");
		System.out.println("Enter employee id:- ");
		int eid = ip.nextInt();
		System.out.println("Enter employee name:- ");
		String ename = ip.next();
		System.out.println("Enter employee designation:- ");
		String edesignation=ip.next();
		System.out.println("enter employee sal:-");
		double esal = ip.nextDouble();
		System.out.println("enter employee ephno:- ");
		long ephno=ip.nextLong();
		System.out.println("enter employee age:- ");
		int age=ip.nextInt();
		l1.add(new Employee(eid, ename, edesignation, esal, ephno, age));
		System.out.println("Employee Added Succesfully..!!!");
		
	}
	@Override
	public void getAllEmp() {
		System.out.println("+++++++Employee Details++++++");
		if(l1.size()==0)//l1 is empty
		{
			System.out.println("Idiot there are no employee");
		}
		else {
			for(Employee emp:l1) {
				System.out.println(emp);
			}
		}
		
	}
	@Override
	public void getEmpByEid() {
		System.out.println("Enter Employee id");
		int eid=ip.nextInt();
		System.out.println("Searching Employee By Eid...!!!");
		boolean flag=false;
		for(Employee ele:l1) {
			if(eid==ele.getEid()) {
				System.out.println(ele);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Eid Not Found.....!!!!");
		}
		
	}
	@Override
	public void findEmpByRangeOfSal() {
		System.out.println("Enter the lowest salary range");
		double l = ip.nextDouble();
		System.out.println("Enter the highest salary range");
		double h=ip.nextDouble();
		System.out.println("Searching......!!!!");
		boolean flag=false;
		for(Employee ele:l1) {
			if(ele.getEsal()>=l && ele.getEsal()<=h) {
				System.out.println(ele);
				flag=true;
			}
		}
		if(flag=false) {
			System.out.println("No Employee Found");
		}
		
		
	}
	
	@Override
	public void updateEmpByEid() {
		System.out.println("Please enter eid:- ");
		int eid=ip.nextInt();
		System.out.println("Searching........!!!!!!");
		Employee e=null;
		for(Employee ele:l1) {
			if(eid==ele.getEid()) {
				e=ele;
				break;
			}
		}
		if(e!=null) {
			System.out.println("====Menu for Update====");
			System.out.println("1.Name\n2.Salary\n3.Age\n4.Designation\n5.Phno");
			System.out.println("Enter your option:-");
			int op=ip.nextInt();
			switch(op) {
			case 1:System.out.println("Enter the name:-");
					String name = ip.next();
					e.setEname(name);break;
			case 2:System.out.println("Enter the salary:-");
					double sal=ip.nextDouble();
					e.setEsal(sal);break;
			case 3:System.out.println("Enter the Age:- ");
			       int age = ip.nextInt();
			       e.setAge(age);break;
			case 4:System.out.println("Enter the Designation:-");
			       String designation=ip.next();
			       e.setEdesignation(designation);break;
			case 5:System.out.println("Enter the Phno.");
					long phno=ip.nextLong();
					e.setEphno(phno);break;
			default:System.out.println("invalid option....!!!!");
			
			}
			
		}
		else {
			System.out.println("Employee Not Found...!!!!");
		}
		
		
	}
	@Override
	public void removeEmpByEid() {
		boolean flag=false;
		System.out.println("Enter the eid:-");
		int eid=ip.nextInt();
		for(int i=0;i<l1.size();i++) {
			if(eid==l1.get(i).getEid()) {
				l1.remove(i);
				System.out.println("Employee Removed....!!!!");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Employee not found...!!!!!");
		}
		
	}
	

}
