package appusers;

public class Address {
	
	private int HouseNo;
	private String StreetName;
	private String AreaName;
	private String city;
	private String District;
	private String State;
	private int Pincode;
	
	public Address(int houseNo, String streetName, String areaName, String city, String district, String state,
			int pincode) {
		super();
		this.HouseNo = houseNo;
		this.StreetName = streetName;
		this.AreaName = areaName;
		this.city = city;
		this.District = district;
		this.State = state;
		this.Pincode = pincode;
		
		
	}

	public int getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getAreaName() {
		return AreaName;
	}

	public void setAreaName(String areaName) {
		AreaName = areaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	
	
	
}
