package entities;

//public class SavingsAccountPlus extends SavingsAccount { <== não deixa porque SavingsAccount foi declarada como final
public class SavingsAccountPlus extends SavingsAccount {
	
	@Override
	public void withdraw(Double value) { //<--- não permite porque o método withdraw na classe SavingsAccount foi declarada como final
		this.balance -= (value + 2);
	}

}
