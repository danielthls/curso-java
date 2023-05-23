package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Insira número de contribuintes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do contribuinte #" + (i + 1) + ":");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			String resposta = sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if (resposta.equalsIgnoreCase("j")) {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, renda, funcionarios));
			} else {
				System.out.print("Gastos com saúde: ");
				double gastos = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, renda, gastos));
			}
			sc.nextLine();
		}
		
		System.out.println("TAXES PAID");
		double sum = 0;
		for (Pessoa p: pessoas) {
			System.out.println(String.format("%s: R$ %.2f", p.getNome(), p.impostos()));
			sum += p.impostos();
		}
		System.out.println();
		System.out.printf("Total arrecadado: R$ %.2f", sum);
		sc.close();

	}

}
