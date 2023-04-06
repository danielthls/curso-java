package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int somaPares = 0;
		int contaPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				contaPares++;
			}
		}
		
		double media = (double) somaPares / contaPares;
		
		System.out.println();
		if (contaPares != 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.printf("NENHUM NÚMERO PAR");
		}
			
		
		sc.close();

	}

}
