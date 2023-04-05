package application;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//System.out.print("Quantity: ");
		//int quantity = sc.nextInt();

		//Produto product = new Produto(name, price, quantity);
		
		Produto product = new Produto(name, price);
		
		System.out.println();
		System.out.println("Product info: " + product);
		

		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Product info: " + product);

		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Product info: " + product);
		
		sc.close();
	}

}
