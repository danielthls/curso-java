package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		String path = "C:\\Java\\curso-java\\Interface\\Interface Comparable\\in.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] parts = line.split(";");
				list.add(new Employee(parts[0], Double.parseDouble(parts[1])));
				line = br.readLine();
			}
		}
		
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		Collections.sort(list);
		
		for (Employee e: list) {
			System.out.println(e);
		}
		
				
				
		sc.close();
	}

}
