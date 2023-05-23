package entities;

public class Product {
	protected String name;
	protected Double price;
	
	public Product() {
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return String.format("%s $ %.2f", this.name, this.price);
	}
}
