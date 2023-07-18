package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
	
		Set<User> log = new HashSet<>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] data = line.split(" ");
				log.add(new User(data[0], Instant.parse(data[1])));
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		/*Set<User> setUsers = new HashSet<>();
		for (User u: log) {
			if (!setUsers.contains(u)) {
				setUsers.add(u);
			}
		}*/
		
		System.out.println("Total users: " + log.size()); 
		
		sc.close();
	}

}
