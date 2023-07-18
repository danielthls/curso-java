package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Set<Product> set1 = new TreeSet<>();
		
		set1.add(new Product("TV", 900.0));
		set1.add(new Product("Notebook", 1200.0));
		set1.add(new Product("Tablet", 400.0));
		
		for (Product p: set1) {
			System.out.println(p);
		}
		
		
		
	}
}
