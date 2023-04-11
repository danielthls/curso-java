package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	
	public static String mostraInfo(List<Funcionario> lista) {
		String result = "";
		for (Funcionario funcionario: lista) {
			result += funcionario;
		}
		
		return result;
	}
	
	public static Integer encontraId(List<Funcionario> lista, Integer id) {
		for (int i = 0; i < lista.size(); i++) {
			Funcionario funcionario = lista.get(i);
			if (funcionario.getId() == id) {
				return i;
			}
		}
		
		return -1;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados? ");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		List <Funcionario> lFuncionario = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Insira Id do funcionário: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println();
			while (encontraId(lFuncionario, id) != -1) {
				System.out.print("Esta ID já está sendo usada. Insira um ID válida: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println();
			}
			System.out.print("Insira nome do funcionário: ");
			String nome = sc.nextLine();
			System.out.println();
			
			System.out.print("Insira o salário do funcionário: R$ ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			lFuncionario.add(new Funcionario(id, nome, salario));			
		}
		
		System.out.println(mostraInfo(lFuncionario));
		
		System.out.println();
		System.out.print("Insira id do funcionário: ");
		Integer id = sc.nextInt();
		System.out.println();
		while (encontraId(lFuncionario, id) == -1) {
			System.out.print("ID não encontrada. Insira uma ID válida: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println();
		}
		

		System.out.print("Insira a porcentagem do aumento de salário: % ");
		Double porcentagem = sc.nextDouble();
		Funcionario funcionario = lFuncionario.get(encontraId(lFuncionario, id));
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println(mostraInfo(lFuncionario));
		
		sc.close();		
	}

}
