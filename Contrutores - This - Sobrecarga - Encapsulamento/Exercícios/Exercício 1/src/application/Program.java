package application;

import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void printData(Account account, String text) {
		System.out.println(text);
		System.out.println(account.accountData());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder");
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit? Y/N");
		String resposta = sc.nextLine();
		System.out.println();
		
		Account account;
		if (resposta.equalsIgnoreCase("y")) { 
			System.out.println("Enter initial deposit value");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
			System.out.println();
		} else {
			account = new Account(number, name);
			System.out.println();

		}
		printData(account, "Account data");
		System.out.println();
		System.out.println("Enter a deposit value");
		
		account.deposit(sc.nextDouble());
		printData(account, "Updated account data");
		
		System.out.println();
		System.out.println("Enter a withdraw value");
		
		account.withdraw(sc.nextDouble());
		printData(account, "Updated account data");
		
		sc.close();
	}

}
