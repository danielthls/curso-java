package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.90));
		
		Consumer<Product> consu1 = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};
		//list.forEach(new ProductConsumer());
		//list.forEach(Product::staticProductConsumer);
		//list.forEach(Product::nonStaticProductConsumer);
		//list.forEach(consu1);
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
			
	}

}
