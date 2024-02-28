package controller;

import java.util.Scanner;

import service.EmployeeService;
import serviceimpl.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeService e = new EmployeeServiceImpl();//upcasting
		Scanner ip = new Scanner(System.in);
		System.out.println("====Welcome Employee Database====");
		while (true) {
			System.out.println("======Menu======");
			System.out.println("1.Add Emplouyee\n2.Display All Employee Details");
			System.out.println("\n3.Searching Employee By Eid\n4.Searching by salary range");
			System.out.println("\n5.Update Emp by Eid\n6.Remove Emp by Eid \n7.exit");
			System.out.println("please enter your option");
			int op = ip.nextInt();
		switch(op) {
		
		case 1:
			e.addEmp();
			break;
		case 2:
			e.getAllEmp();
			break;
		case 3:e.getEmpByEid();
				break;
		case 4:e.findEmpByRangeOfSal();
				break;
		case 5:e.updateEmpByEid();
				break;
		case 6:e.removeEmpByEid();
				break;
		case 7:
			System.out.println("===Thank you Visit Again===");
			System.exit(0);
			
		default:
			System.out.println("=====Invalid Option====");
		
		}

	}
	}
}

