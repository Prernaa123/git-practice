package StudentManagement;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
	static Scanner sc = new Scanner(System.in);
	//1.Add Student
	public static Student addStudent() {
		
		Student s = new Student();
		System.out.print("Please Enter StudentId : ");
		s.setsId(sc.nextInt());
		System.out.print("Please Enter StudentName: ");
		s.setSname(sc.next());
		System.out.print("Please Enter StudentAge: ");
		s.setAge(sc.nextInt());
		return s;
	}
	//2.Update student
	public static Student upadateStudent(List<Student> students) {
		System.out.print("Please enter the Update Details: ");
		
		System.out.print("Enter SID:");
		int id = sc.nextInt();
		System.out.print("Enter Sname: ");
		String name = sc.next();
		System.out.print("Enter SAge");
		int age = sc.nextInt();
		
		//Done the changes in actual Student List
		int count = 0;
		for(Student s : students) {
			if(id==s.getsId()) {
				break;
			}
			count++;
		}
		students.get(count).setSname(name);
		students.get(count).setAge(age);
		return null;
		
	}
	//3.Display Student
	public static void displayAllStudent(List<Student> students) {
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next().toString());
		}
	}
	//4.Delete Student
	
	public static void deleteStudent(List<Student> students,int sid) {
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext()) {
			Student s = studentIterator.next();
			if(s.getsId()==sid) {
				studentIterator.remove();
			}
		}
	}
}
