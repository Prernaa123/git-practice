package appusers;

public class Customer {
	private String Name;
	private char gender;
	private int age;
	private long phoneno;
	private Address addr;
	public Customer(String name, char gender, int age, long phoneno,int houseNo, String streetName, String areaName, String city, String district, String state,
			int pincode) {
		super();
		Name = name;
		this.gender = gender;
		this.age = age;
		this.phoneno = phoneno;
		this.addr = new Address(houseNo,streetName,areaName,city,district,state,pincode);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
