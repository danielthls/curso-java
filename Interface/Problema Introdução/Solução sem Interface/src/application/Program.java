package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Ente com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Data e hora da retirada: ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Data e hora do retorno: ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr  = new CarRental(new Vehicle(carModel), start, finish);
		
		System.out.print("Insira preço por dia: ");
		double  pricePerDay = sc.nextDouble();
		
		System.out.print("Insira preço por hora: ");
		double pricePerHour = sc.nextDouble();
		sc.nextLine();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		System.out.println("FATURA");
		System.out.println("Pagamento básico:  R$ " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: R$" + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("TOTAL: R$" + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
	}

}
