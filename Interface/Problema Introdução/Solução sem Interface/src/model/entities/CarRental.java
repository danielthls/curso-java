package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	private Vehicle vehicle;
	private LocalDateTime start;
	private LocalDateTime finish;
	private Invoice invoice;
	
	public CarRental() {
	}
	
	public CarRental(Vehicle vehicle, LocalDateTime start, LocalDateTime finish) {
		this.vehicle = vehicle;
		this.start = start;
		this.finish = finish;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	public LocalDateTime getStart() {
		return this.start;
	}
	
	public LocalDateTime getFinish() {
		return this.finish;
	}
	
	public Invoice getInvoice() {
		return this.invoice;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	
	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
