package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Set<Product> set1 = new HashSet<>();
		
		set1.add(new Product("TV", 900.0));
		set1.add(new Product("Notebook", 1200.0));
		set1.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set1.contains(prod));
		
		
		
	}
}
