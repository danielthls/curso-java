package entities;

public class Employee implements Comparable<Employee> {
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee other) {
		return -this.salary.compareTo(other.getSalary());
	}
	
	public String toString() {
		return String.format("%s: %.2f", this.name, this.salary);
	}
}
