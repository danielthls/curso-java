package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> cookies = new TreeMap();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.err.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES");
		for (String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("TV", 900.0);
		
		//Só vai retornar verdadeiro se fizer o hashCode e equals na classe Product, senão procura por ponteiros
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
