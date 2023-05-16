package entities;

import java.time.LocalDate;

public class Client {
	private String name;
	private String email;
	private LocalDate birthday;
	
	public Client() {
		
	}
	
	public Client(String name, String email, LocalDate birthday) {
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public LocalDate getBirthday() {
		return this.birthday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
