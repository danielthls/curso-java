package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
		
	}
	
	public Reservation(int roomNumber, LocalDate checkIn, LocalDate checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return this.roomNumber;
	}
	
	public LocalDate getCheckIn() {
		return this.checkIn;
	}
	
	public LocalDate getCheckOut() {
		return this.checkOut;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Integer duration() {
		return (int) Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay()).toDays();
	}
	
	public void  updateDates(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public String dateFormat(LocalDate date) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return date.format(fmt);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: ");
		sb.append(String.format("Room number %d, ", this.roomNumber));
		sb.append(String.format("check-in: %s, ", dateFormat(this.checkIn)));
		sb.append(String.format("check-out: %s, ", dateFormat(this.checkOut)));
		sb.append(String.format("%d nights.", this.duration()));
		return sb.toString();
	}
}
