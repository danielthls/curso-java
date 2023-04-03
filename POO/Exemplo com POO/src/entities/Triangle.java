package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	private double pResult() {
		return (a + b + c) / 2;		
	}
	
	public double area() {
		double p = pResult();
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
	
}
