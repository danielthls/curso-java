package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birthdate (DD/MM/YYYY): ");
		LocalDate birthday = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Client client = new Client(name, email, birthday);
		
		System.out.println("Enter order data:");
		System.out.print("Order status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		Integer quantity = sc.nextInt();
		sc.nextLine();
		
		Order order = new Order(Instant.now(), OrderStatus.valueOf(status), client);
		for (int i = 0; i < quantity; i++) {
			System.out.println(String.format("Enter #%d item data:", i + 1));
			System.out.print("Product name: ");
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer pQuantity = sc.nextInt(); 
			sc.nextLine();
			Product product = new Product(pName, pPrice);
			OrderItem item = new OrderItem(pQuantity, product.getPrice(), product);
			order.addItem(item);
		}
		
		System.out.println(order.toString());
		
		
		
		
		sc.close();
	}

}
