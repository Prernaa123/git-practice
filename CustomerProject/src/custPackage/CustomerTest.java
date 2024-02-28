package custPackage;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerAddress a1 = new CustomerAddress("fh09","SahnajGali","Banglore","Karnatka","India",760001);
		Customer c1 = new Customer("abc",123,12434648,"abdarshanc504@gmail.com",a1,"AFGH46224");
		System.out.println(c1);
		System.out.println(a1);
	}

}
