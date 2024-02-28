package app;

public class Cab {

	  private String drivername;
	  private long driverphno;
	  private String cabno;
	  private Location pickup;//classtype=Location
	  private Location drop ;//classtype=Location
	
	  public Cab(String drivername, long driverphno, String cabno, 
				double pickuplongitude,double pickuplatitude,String pickupdirection,
				double droplatitude,double droplongitude,String dropdirection) {
		
		this.drivername = drivername;
		this.driverphno = driverphno;
		this.cabno = cabno;
		this.pickup = new Location(pickuplongitude,pickuplatitude,pickupdirection);
		this.drop = new Location(droplongitude,droplatitude,dropdirection);
	}
	  
		public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public long getDriverphno() {
		return driverphno;
	}

	public void setDriverphno(long driverphno) {
		this.driverphno = driverphno;
	}

	public String getCabno() {
		return cabno;
	}

	public void setCabno(String cabno) {
		this.cabno = cabno;
	}

	public Location getPickup() {
		return pickup;
	}

	public void setPickup(Location pickup) {
		this.pickup = pickup;
	}

	public Location getDrop() {
		return drop;
	}

	public void setDrop(Location drop) {
		this.drop = drop;
	}

		
		
}
