package learningList;

public class NoteBook {
	String brand;
	int pages;
	double price;
	public NoteBook(String brand, int pages, double price) {
		super();
		this.brand = brand;
		this.pages = pages;
		this.price = price;
	}
	@Override
	public String toString() {
		return "NoteBook [brand=" + brand + ", pages=" + pages + ", price=" + price + "]";
	}
	
	
}
