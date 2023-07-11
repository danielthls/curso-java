package application;

import java.util.Scanner;

import services.InterestService;
import services.UsInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		Integer months = sc.nextInt();
		
		InterestService is = new UsInterestService(1.0);
		
		double payment = is.getTotalLoan(amount, months);
		
		System.out.println("Payment after " + months + "months: ");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
