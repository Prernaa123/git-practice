package oops;

public class Person {
	int age;
	String name;
	char gender;
	
	public Person(int age,String name,char gender)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
	}
	void details()
	{
		System.out.println(" Name: "+name+" Age: "+age+" Gender "+gender);
	}
}
