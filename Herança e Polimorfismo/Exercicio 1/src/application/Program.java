package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Product> products = new ArrayList<>();		
		
		for (int i = 0; i < n; i++) {
			System.out.println(String.format("Enter Product #%d data:", i+1));
			System.out.print("Common, used or imported (c/u/i)? ");
			String reply = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (reply.equalsIgnoreCase("u")) {
				sc.nextLine();
				System.out.print("Manufacture date (dd/mm/yyyy): ");
				LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				products.add(new UsedProduct(name, price, date));
			} else if (reply.equalsIgnoreCase("i")) {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customFee));
			} else {
				products.add(new Product(name, price));
			}
			
		}
		
		for (Product p: products ) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
