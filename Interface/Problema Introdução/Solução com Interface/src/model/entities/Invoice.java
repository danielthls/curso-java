package model.entities;

public class Invoice {
	private Double basicPayment;
	private	Double tax;
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	public Double getBasicPayment() {
		return this.basicPayment;
	}
	
	public Double getTax() {
		return this.tax;
	}
	
	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
