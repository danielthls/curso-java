package application;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto product = new Produto();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
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
