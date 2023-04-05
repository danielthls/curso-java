package entities;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;
	
	public static final double WITHDRAW_FEE = 5.00;
	
	public Account(int accountNumber, String name) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0.00;
	}
	
	public Account(int accountNumber, String name,  double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.deposit(initialDeposit);;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + WITHDRAW_FEE);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String accountData() {
		return "Account "
			+	this.accountNumber
			+	", Holder "
			+	this.name
			+	", Balance: $ "
			+	String.format("%.2f",this.balance);
	}
}
