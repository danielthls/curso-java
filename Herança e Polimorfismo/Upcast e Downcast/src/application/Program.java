package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 3.0, 500.0);
		
		// UPCASTING
		Account accUpcast1 = bacc;
		System.out.println(accUpcast1.getBalance());
		
		Account accUpcast2 = new BusinessAccount(1003, "Bob", 1.50, 200.0);
		System.out.println(accUpcast2.getHolder());
		
		Account accUpcast3 = new SavingsAccount(1004, "Ana", 8.89, 0.005);
		System.out.println(accUpcast3.getNumber());
		
		// DOWNCAST
		BusinessAccount accDowncast1 = (BusinessAccount) accUpcast1;
		accDowncast1.loan(100.0);
		
		//BusinessAccount accDowncast2 = (BusinessAccount) accUpcast3; <-- Dá erro porque accUpcast3 é instancia de SavingsAccount, que não é compatível
		if (accUpcast3 instanceof BusinessAccount) {
			BusinessAccount accDowncast2 = (BusinessAccount) accUpcast3;
			accDowncast2.loan(45.4);
			System.out.println("loan!");
		}
		
		if (accUpcast3 instanceof SavingsAccount) {
			SavingsAccount accDowncast2 = (SavingsAccount) accUpcast3;
			accDowncast2.updateBalance();
			System.out.println("Update!");
		}
	}

}
