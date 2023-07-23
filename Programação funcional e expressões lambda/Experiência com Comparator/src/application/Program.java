package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		
		list.sort(new MyComparator());
		//print com MyComparator
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Comparator<Product> comp1 = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return  -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		list.sort(comp1);
		//Print com comp1
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Comparator<Product> comp2 = (p1, p2) -> {
			return p1.getPrice().compareTo(p2.getPrice());
		};
		
		list.sort(comp2);
		
		//print com comp2
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		list.sort((p1, p2) -> -p1.getPrice().compareTo(p2.getPrice()));
		
		//print sem nada
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
