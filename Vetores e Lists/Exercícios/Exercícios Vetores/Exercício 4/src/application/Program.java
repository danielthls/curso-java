package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantidade de valores: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//if (n > 10) n = 10;
		
		int[] vect = new int[n];
		
		
		
		int contaPar = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Insira número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				contaPar++;
			}
			sc.nextLine();
		}
		
		System.out.println("NÚMEROS PARES:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ",vect[i]);					
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE NÚMEROS PARES = %d", contaPar);
		
		sc.close();

	}

}
