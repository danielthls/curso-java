package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		
		int n = sc.nextInt();
		sc.nextLine();
		Pessoa[] vectPessoa = new Pessoa[n];
		
		for (int i = 0; i < vectPessoa.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.println();
			vectPessoa[i] = new Pessoa(nome, idade);
		}
		
		String pessoaMaisVelha = getPessoaMaisVelha(vectPessoa);
		
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);
		
		sc.close();
	}
	
	public static String getPessoaMaisVelha(Pessoa[] vect) {
		String nome = "";
		int maisVelho = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (i == 0) {
				maisVelho = vect[i].getIdade();
				nome = String.format("%s ", vect[i].getNome());
			} else if (vect[i].getIdade() > maisVelho) {
				maisVelho = vect[i].getIdade();
				nome = String.format("%s ", vect[i].getNome());
			} else if (vect[i].getIdade() == maisVelho) {
				nome += String.format("%s ", vect[i].getNome());
			}
		}
		
		return nome;
	}
}
