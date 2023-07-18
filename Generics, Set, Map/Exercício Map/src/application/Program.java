package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Java\\curso-java\\Generics, Set, Map\\Exercício Map\\in.csv";
		
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			
			while (line != null) {
				String[] vote = line.split(",");

				if (votes.containsKey(vote[0])) {
					votes.put(vote[0], votes.get(vote[0]) + Integer.parseInt(vote[1]));
				} else {
					votes.put(vote[0], Integer.parseInt(vote[1]));
				}
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for (String key: votes.keySet()) {
			System.out.println(key + ": " + votes.get(key));
		}
	}

}
