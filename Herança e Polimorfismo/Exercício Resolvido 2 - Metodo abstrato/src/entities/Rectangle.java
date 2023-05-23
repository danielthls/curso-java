package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return this.width;
	}
	
	public Double getHeight() {
		return this.height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public final Double area() {
		return this.height * this.width;
	}
}
