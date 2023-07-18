package entities;

import java.time.Instant;
import java.util.Objects;

public class User {
	private String name;
	private Instant access;
	
	public User() {
		
	}
	
	public User(String name, Instant access) {
		this.name = name;
		this.access = access;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Instant getAccess() {
		return this.access;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAccess(Instant access) {
		this.access = access;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
