package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Insert products quantity: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		List<Product> products = new ArrayList<>();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Insert product name: ");
			String name = sc.nextLine();
			System.out.print("Insert price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			products.add(new Product(name, price));
		}
		
		Order order = new Order();
		for (Product p: products)  {
			System.out.println(p.toString());
			System.out.print("Insert quantity: ");
			qtd = sc.nextInt();
			order.addItem(new OrderItem(qtd, p.getPrice(), p));
		}
		
		String path = "c:\\Java\\curso-java\\Arquivos\\Exercício 1\\in";
		
		File folder = new File(path);
		if (!folder.exists()) {
			folder.mkdir();
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\in.csv"))){
			for (OrderItem item: order.getItems()) {
				bw.write(item.toString());
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		order = new Order();
		*/
		
		Order order = new Order();
		
		String path = "c:\\Java\\curso-java\\Arquivos\\Exercício 1\\in";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path + "\\in.csv"))) {
			String line = br.readLine();
			
			while (line != null || line != "") {
				String[] parts = line.split(";");
				String name = parts[0];
				parts[1] = parts[1].replace(',', '.');
				double price = Double.parseDouble(parts[1]);
				int quantity = Integer.parseInt(parts[2]);
				order.addItem(new OrderItem(quantity, price, new Product(name, price)));
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		path = "c:\\Java\\curso-java\\Arquivos\\Exercício 1\\out";
		
		File folder = new File(path);		
		if (!folder.exists()) {
			folder.mkdir();
		}
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\summary.csv"))){
			for (OrderItem item: order.getItems()) {
				bw.write(String.format("%s;%.2f", item.getProduct().getName(), item.subTotal()));
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Success!!");
		sc.close();
	}

}
