package oops;

public class Student extends Person {
	int rollno;
	String collegename;
	double marks;
	
	Student(String name,int age,char gender,int rollno,String collegename,double marks)
	{
		super(age,name,gender);
		this.rollno=rollno;
		this.collegename=collegename;
		this.marks=marks;
	}
	void details()
	{
		System.out.println(" Name: "+name+" Age: "+age+" Gender: "+gender+" rollno: "+rollno+" Collegename: "+collegename+" Marks: "+marks);
	}

}
