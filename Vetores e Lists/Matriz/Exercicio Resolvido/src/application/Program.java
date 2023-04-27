package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int contaNegativo = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) contaNegativo++; 
			}
		}
		
		System.out.print("Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			
		}
		System.out.println();
		System.out.println("Negative values: " + contaNegativo);
		
		sc.close();
	}

}
