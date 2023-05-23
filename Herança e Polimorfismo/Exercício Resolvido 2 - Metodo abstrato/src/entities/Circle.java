package entities;

import entities.enums.Color;

public class Circle extends Shape{

	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public final Double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
