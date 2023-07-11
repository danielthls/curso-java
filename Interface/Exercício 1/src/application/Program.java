package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import model.entities.Contrato;
import model.services.ProcessamentoContrato;
import model.services.ServicoPagamentoPaypal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Insira o número de parcelas: ");
		int parcelas = sc.nextInt();
		sc.nextLine();
		int numeroContrato = new Random().nextInt(1000);
		
		System.out.print("Insira a data do contrato: ");
		LocalDate dataContrato = LocalDate.parse(sc.nextLine(), fmt);
		
		System.out.print("Insira o valor do contrato: ");
		double valor = sc.nextInt();
		sc.nextLine();
		
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valor);
		
		ProcessamentoContrato.ProcessarContrato(contrato, parcelas, new ServicoPagamentoPaypal());
		System.out.println("\n");
		System.out.println(contrato);
		
		sc.close();
	}

}
