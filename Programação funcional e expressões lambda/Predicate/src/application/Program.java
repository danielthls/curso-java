package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.90));
		
		Predicate<Product> pred1 = p -> p.getPrice() >= 100;
		
		double min = 100;
		
		Predicate<Product> pred2 = p -> p.getPrice() >= min;
		
		//list.removeIf(new ProductPredicate()); - Implementação da interface
		//list.removeIf(Product::staticProductPredicate); Reference method com método estático
		//list.removeIf(Product::nonStaticProductPredicate); Reference method com método não estático
		//list.removeIf(pred1);
		//list.removeIf(pred2);
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
