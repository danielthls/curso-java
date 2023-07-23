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

	public static void staticProductConsumer(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticProductConsumer() {
		this.setPrice(getPrice() * 1.1);
	}
	
	@Override
	public String toString() {
		return String.format("[ %s  = %.2f ]", name, price);
	}
}

