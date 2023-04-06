package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Pessoa[] vPessoa = new Pessoa[n];
		double maxAltura = 0;
		double minAltura = 0;
		double somaAlturaMulheres = 0;
		int contaMulher = 0;
		int contaHomem = 0;
		
		for (int i = 0; i < vPessoa.length; i++) {
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			sc.nextLine();
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			vPessoa[i] = new Pessoa(genero, altura);
			
			if (i == 0) {
				maxAltura = vPessoa[i].getAltura();
				minAltura = vPessoa[i].getAltura();
			} else if (vPessoa[i].getAltura() > maxAltura) {
				maxAltura = vPessoa[i].getAltura();
			} else if (vPessoa[i].getAltura() < minAltura) {
				minAltura = vPessoa[i].getAltura();
			}
			
			if (vPessoa[i].getGenero() == 'f') {
				somaAlturaMulheres += vPessoa[i].getAltura();
				contaMulher++;
			} else if (vPessoa[i].getGenero() == 'm') {
				contaHomem++;
			}
		}
		
		double mediaMulher = somaAlturaMulheres / contaMulher; 
				
		
		
		System.out.printf("MENOR ALTURA = %.2f%n", minAltura);
		System.out.printf("MAIOR ALTURA = %.2f%n", maxAltura);
		System.out.printf("MÉDIA DA ALTURA DAS MULHERES = %.2f%n", mediaMulher);
		System.out.printf("NÚMERO DE HOMENS = %d%n", contaHomem);
		
		sc.close();
	}

}
