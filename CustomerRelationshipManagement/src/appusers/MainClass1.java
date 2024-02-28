package appusers;

public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("Creating Customer");
		Customer c1 = new Customer("Ramesh",'M',24,999988893,123,"Banerghat rd","Jp nagar","Bengaluru","Btm","Karnatka",560002);
		System.out.println("cutomer name:"+c1.getName());
		System.out.println(c1.getGender());
		System.out.println("pincode"+c1.getAddr().getPincode());
		System.out.println("Changing house Number");
		c1.getAddr().setHouseNo(124);
		System.out.println("Update");
		
      		Address a1 = new Address(123,"Bs rd","qp nagar","Bengal","Bm","Karnaka",560002);
		
		c1.setAddr(a1);
		System.out.println(c1.getAddr().getCity());
	}

}


//int houseNo, String streetName, String areaName, String city, String district, String state,
//int pincode)