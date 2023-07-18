package entities;

public class Circle implements Shape {
	private Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(getRadius(), getRadius());
	}
	
}
