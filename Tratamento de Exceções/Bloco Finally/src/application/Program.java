package application;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir o programa: " + e.getMessage());
		}
		
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco finally executado");
		}
		
	}

}
