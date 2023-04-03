package application;

import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double preco = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double quantidade = sc.nextInt();
		
		System.out.printf("Amount to be pais in reais: R$ %.2f", CurrencyConverter.calculaDolar(preco, quantidade));

	}

}
