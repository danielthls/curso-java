package model.entities;

public class Vehicle {
	
	private String model;
	
	public Vehicle() {
	}
	
	public Vehicle(String model) {
		this.model = model;
	}
	
	public String geModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
}
