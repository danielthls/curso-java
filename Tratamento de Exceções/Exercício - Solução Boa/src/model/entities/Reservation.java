package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.execptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	private final String ERROR_FUTURE = "Error in reservation: Reservation dates for update must be future dates";
	private final String ERROR_CHECKOUT = "Error in reservation: Check-out date must be after check-in date"; 
	
	public Reservation() {
		
	}
	
	public Reservation(int roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		compareDates(checkIn, checkOut, ERROR_CHECKOUT);
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
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		LocalDate now = LocalDate.now();
		compareDates(checkIn, now, ERROR_FUTURE);
		compareDates(checkOut, now, ERROR_FUTURE);
		compareDates(checkIn, checkOut, ERROR_CHECKOUT);
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public String dateFormat(LocalDate date) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return date.format(fmt);
	}
	
	private void compareDates(LocalDate firstDate, LocalDate secondDate, String errorMessage) throws DomainException {
		if (firstDate.isAfter(secondDate)) {
			throw new DomainException(errorMessage);
		}
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
