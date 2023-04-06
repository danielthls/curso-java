package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		double maiorNumero = getHighestNumber(vect);
		String maiorPos = getHighestPosition(vect, maiorNumero);
		
		System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %s%n", maiorPos);
		
		sc.close();
	}
	
	public static double getHighestNumber(double vect[]) {
		double highestValue = 0;
		for (int i = 0; i < vect.length; i++) {
			if (i == 0) {
				highestValue = vect[i];
			}
			
			if (vect[i] > highestValue) {
				highestValue = vect[i];
			}
		}
		
		return highestValue;
	}
	
	public static String getHighestPosition(double vect[], double highestValue) {
		String highestPos = "";
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] == highestValue) {
				highestPos += String.format("%d ", i);
			}
		}
		
		return highestPos;
	}
	

}
