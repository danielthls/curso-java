package application;


import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account acc1 = new Account(1001, "Alex", 1000.0);
		//acc1.withdraw(50.0);
		//System.out.println(acc1.getBalance());
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
		list.add(new BusinessAccount(1003, "Bob", 1000, 500.00));
		list.add(new SavingsAccount(1006, "Ana", 1000.0, 0.01));
		list.add(new BusinessAccount(1005, "Carlos", 1000.0, 900));
		
		double sum = 0;
		
		for (Account acc: list) {
			sum += acc.getBalance();
		}
		
		System.out.println(sum);
		/*Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(50.0); //a operação withdraw é feita usando o método de SavingsAccount e não de Account
		System.out.println(acc2.getBalance());*/
		
	}

}
