package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert number of products");
		
		int n = sc.nextInt();
		sc.nextLine();
		Product[] vectProduct = new Product[n];
		double sum = 0;
		
		
		for (int i = 0; i < vectProduct.length; i++) {
			System.out.print("Insert product name: ");
			String name = sc.nextLine();
			System.out.print("Insert product price: $ ");
			double price = sc.nextDouble();
			sc.nextLine();
			vectProduct[i] = new Product(name, price);
			sum += vectProduct[i].getPrice();
		}
		
		double avg = sum / vectProduct.length;
		
		System.out.printf("Average price: $ %.2f",avg);
		
		sc.close();
	}

}
