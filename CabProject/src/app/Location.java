package app;
public class Location {
		private double latitude;
		private double longitude;
		private String direction;
		
	
		public Location(double longitude, double latitude, String direction) {
			
			this.longitude = longitude;
			this.latitude = latitude;
			this.direction = direction;
		}
		
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		public String getDirection() {
			return direction;
		}
		public void setDirection(String direction) {
			this.direction = direction;
		}
		
		
		
}
