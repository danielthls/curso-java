package entities;

public class Employee {
	private String name;
	private String email;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Salary: %.2f", this.name, this.salary);
	}
}
