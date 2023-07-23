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

	public static String staticProductFunction(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticProductFunction() {
		return this.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return String.format("[ %s  = %.2f ]", name, price);
	}
}

