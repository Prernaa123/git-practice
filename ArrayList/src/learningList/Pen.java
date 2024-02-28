package learningList;

public class Pen {
	String brand;
	String color;
	double price;
	public Pen(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
