package entities;

public class HotelRoom {
	private int room;
	private String guestName;
	private String guestEmail;
	
	public HotelRoom(int room, String guestName, String guestEmail) {
		this.room = room;
		this.guestName = guestName;
		this.guestEmail = guestEmail;
	}
	
	public int getRoom() {
		return room;
	}
	
	public String getGuestName() {
		return guestName;
	}
	
	public String getGuestEmail() {
		return guestEmail;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
	public void setGuestName(String name) {
		this.guestName = name;
	}
	
	public void setGuestEmail(String email) {
		this.guestEmail = email;
	}
}
