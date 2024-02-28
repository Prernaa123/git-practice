package app;

public class MainClass {
	public static void main(String[] args) {
		Cab c1 = new Cab("Ramesh",8249348500l,"ER420",23.5,24.5,"East",45.5,65.2,"West");
		System.out.println(c1.getDrivername());
		System.out.println(c1.getDriverphno());
		System.out.println(c1.getCabno());
		System.out.println(c1.getPickup().getLongitude());
		System.out.println(c1.getPickup().getLatitude());
		System.out.println(c1.getPickup().getDirection());
		System.out.println(c1.getDrop().getLongitude());
		System.out.println(c1.getDrop().getLatitude());
		System.out.println(c1.getDrop().getDirection());
		System.out.println(c1.getDrop().getDirection());
		c1.getPickup().setDirection("North");
		System.out.println(c1.getPickup().getDirection());
		c1.setDriverphno(8795234789l);
		System.out.println(c1.getDriverphno());
		
		
	}
}
