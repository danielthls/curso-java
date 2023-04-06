package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {
	
	public static final int idade15 = 15;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//if (n > 10) n = 10;
		
		Pessoa[] vectPessoa = new Pessoa[n];
		double somaAltura = 0;
		int totalIdade = n;
		int totalIdade15 = 0;
		
		
		
		for (int i = 0; i < vectPessoa.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();			
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			vectPessoa[i] = new Pessoa(nome, idade, altura);
			
			somaAltura += vectPessoa[i].getAltura();
			
			if (vectPessoa[i].getIdade() <= idade15) {
				totalIdade15 ++;
			}
		}
		
		double media = (double) somaAltura / vectPessoa.length;
		double percentual15 = (double) (totalIdade15 * 100) / totalIdade;
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentual15);
		
		for (int i = 0; i < vectPessoa.length; i++) {
			if (vectPessoa[i].getIdade() < 16) {
				System.out.println(vectPessoa[i].getNome());
			}
		}
		
		
	}

}
