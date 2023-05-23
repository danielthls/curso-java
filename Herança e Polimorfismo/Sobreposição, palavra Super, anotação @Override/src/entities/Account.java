package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Integer getNumber() {
		return this.number;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public Double getBalance() {
		return this.balance;
	}
	
	public void setNumber(Integer number) {
		this.number =  number;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void deposit(Double value) {
		this.balance += value;
	}
	
	public void withdraw(Double value) {
		this.balance -= (value + 5.0);
	}
}
