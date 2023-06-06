package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			Account account = new Account(number, holder, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount to withdraw: ");
			account.withdraw(sc.nextDouble());
			System.out.printf("New balance: R$ %.2f", account.getBalance());
		}
		
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Error: " + e.getStackTrace());
		}
		sc.close();

	}

}
