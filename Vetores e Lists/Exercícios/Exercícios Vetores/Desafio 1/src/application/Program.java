package application;

import java.util.Scanner;

import entities.HotelRoom;

public class Program {

	public static final int NUMBER_OF_ROOMS = 10;
	
	public static String getTakenRooms(HotelRoom[] vector) {
		String takenRooms = "";
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != null) {
				takenRooms += String.format("%d: %s, %s%n", vector[i].getRoom(), vector[i].getGuestName(), vector[i].getGuestEmail());
			}
		}
		
		return takenRooms;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HotelRoom[] rooms = new HotelRoom[NUMBER_OF_ROOMS];
		
		System.out.print("Insert number of guests staying in the hotel (min 1 max 10): ");
		int n = sc.nextInt();
		sc.nextLine();
		
		while (n > 10 || n < 1) {
			System.out.print("Invalid number. Insert a value between 1 and 10: ");
			n = sc.nextInt();
			sc.nextLine();
		}

		for (int i = 0; i < n; i++) {
			System.out.print("Insert room number (0 - 9): ");
			int room = sc.nextInt();
			sc.nextLine();
			while (room > 9 || n < 0) {
				System.out.print("Invalid number. Insert a value between 0 and 9: ");
				room = sc.nextInt();
				sc.nextLine();
			}
			System.out.print("Insert guest name: ");
			String name = sc.nextLine();
			System.out.print("Insert guest e-mail: ");
			String email = sc.nextLine();
			
			rooms[room] = new HotelRoom(room, name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		System.out.println(getTakenRooms(rooms));
		
		sc.close();
	}

}
