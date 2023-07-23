package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name  = name;
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
	
	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() {
		return this.getPrice() >= 100;
	}
	
	@Override
	public String toString() {
		return "[" + name + " = " + price + "]";
	}
}

