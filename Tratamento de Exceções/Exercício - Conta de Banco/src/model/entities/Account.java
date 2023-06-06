package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	private final String ERROR_LIMIT = "Error: cannot withdraw more than permitted limit";
	private final String ERROR_BALANCE = "Error: cannot withdraw more than current balance";
	
	public Account() {
	}
	
	public Account(Integer number, String holder, double balance, double withdrawLimit) throws DomainException{
		compareValueException(0, withdrawLimit, "Error: Withdraw limit cannot be lower than $ 0,00");
		compareValueException(0, balance, "Error: Balance cannot be lower than $ 0,00");
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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
	
	public Double getWithdrawLimit() {
		return this.withdrawLimit;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setHolder (String holder) {
		this.holder = holder;
	}
	
	public void setWithdrawLimit(double withdrawLimit) throws DomainException {
		compareValueException(0, withdrawLimit, "Error: Balance cannot be lower than $ 0,00");
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) throws DomainException {
		compareValueException(0, amount, "Error: Deposited amount cannot be lower than $ 0,00");
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws DomainException {
		compareValueException(0, amount, "Error: Balance cannot be lower than $ 0,00");
		compareValueException(amount, this.balance, ERROR_BALANCE);
		compareValueException(amount, this.withdrawLimit, ERROR_LIMIT);
		this.balance -= amount;
	}
	
	private void compareValueException(double lowValue, double highValue, String errorMsg) throws DomainException {
		if (lowValue > highValue) {
			throw new DomainException(errorMsg);
		}
	}
}
