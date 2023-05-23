package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return this.loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double loan) {
		if (loan <= this.loanLimit) {  
			this.deposit(loan);
			this.loanLimit -= loan;
			this.balance += loan;
		}	
	}
	
	@Override
	public void withdraw(Double value) {
		super.withdraw(value);
		this.balance -= 2;
	}
}