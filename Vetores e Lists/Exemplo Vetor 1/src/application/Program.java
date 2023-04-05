package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double total = 0;
		
		for (int i = 0; i < n; i++) {
			double vectValue = sc.nextDouble();
			vect[i] = vectValue;
			total += vect[i];
		}
		
		double avg = total / n;
		
		System.out.println(avg);
		sc.close();
	}

}
