package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira número de linhas: ");
		int n = sc.nextInt();
		System.out.print("Insira número de colunas: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		System.out.println("Insira os dados da matriz");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Insira valor a ser checado: ");
		int x = sc.nextInt();
		
		checarValor(mat, x);
		sc.close();
	}

	public static void checarValor(int[][] matriz, int x) {
		boolean achouX = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (x == matriz[i][j]) {
					achouX = true;
					System.out.printf("Posição: (%d, %d)", i, j);
					System.out.println();
					if (!(i - 1 < 0)) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					if (!(i + 1 >= matriz.length)) {
						System.out.println("Baixo: " + matriz[i+1][j]);
					}
					if (!(j - 1 < 0)) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (!(j + 1 >= matriz.length)) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
				}
			}
			
		}
		
		if (!achouX) System.out.println("Valor x não encontrado."); 
		
	}
}
