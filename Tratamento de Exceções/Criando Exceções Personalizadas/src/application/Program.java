package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Check-in Date (dd-mm-yyyy): ");
		LocalDate checkIn = strToDate(sc.nextLine());
		
		System.out.print("Check-out Date (dd-mm-yyyy): ");
		LocalDate checkOut = strToDate(sc.nextLine());
		
		Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
		System.out.println(reservation);
		
		System.out.println();
		System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in Date (dd-mm-yyyy): ");
		checkIn = strToDate(sc.nextLine());
		System.out.print("Check-out Date (dd-mm-yyyy): ");
		checkOut = strToDate(sc.nextLine());
		
		reservation.updateDates(checkIn, checkOut);
		
		System.out.println(reservation);
		sc.close();
	}
	
	public static LocalDate strToDate(String dataText) {
		DateTimeFormatter fmtDataPadrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(dataText, fmtDataPadrao);
	}
}
