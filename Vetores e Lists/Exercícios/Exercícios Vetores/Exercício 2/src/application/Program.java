package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert number of values: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//if (n > 10) n = 10;
		
		double[] vect = new double[n];
		
		double sum = 0;		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Insert number: ");
			vect[i] = sc.nextInt();
			sum += vect[i];
			sc.nextLine();
		}
		
		double media = (double) sum / vect.length;
		
		System.out.print("VALORES: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MÉDIA = " + media);
		
		sc.close();
	}

}
