package model.services;

public class BrazilTaxService {
	
	public final double faixa1 = 100;
	
	
	public Double tax(double amount) {
		if (amount <= faixa1) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
