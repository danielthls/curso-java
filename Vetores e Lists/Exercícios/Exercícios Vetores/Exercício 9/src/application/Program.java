package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados?");
		int n = sc.nextInt();
		sc.nextLine();
		
		Aluno[] vAluno = new Aluno[n];
		String aprovados = ("Alunos aprovados\n");		
		
		for (int i = 0; i < vAluno.length; i++) {
			System.out.printf("Insira nome, primeira e segunda nota do %do aluno%n", i+1);
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			sc.nextLine();
			vAluno[i] = new Aluno(nome, nota1, nota2);
			if (vAluno[i].aprovado()) {
				aprovados += String.format("%s%n", vAluno[i].getNome());
			}
		}
		
		System.out.print(aprovados);
			
		sc.close();
	}

}
