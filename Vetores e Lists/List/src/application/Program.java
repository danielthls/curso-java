package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("Patapon");
		list.add(1, "Bob");
		list.add(4, "João");
		list.add("Marco");
		list.add("Jilson");
		list.add("Bob");
		list.add("Anna");
		list.add("Alex");
		list.add("Ana Maria");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		list.remove("Patapon");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Narone: " + list.indexOf("Narone"));
		System.out.println(list.size());
		
		System.out.println("-----------------------------");
		// converte list para stream, faz o filter e depois converte de volta para list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Lista só quem começa com A
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
