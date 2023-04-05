package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert number of values: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n > 10) n = 10;
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Insert number: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) System.out.println(vect[i]);
		}
		
		
		sc.close();

	}

}
