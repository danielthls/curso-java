package utils;

public class CurrencyConverter {
	public static final double IOF = 6;
	
	public static double calculaDolar(double aPreco, double aQuantidade) {
		double total = aPreco * aQuantidade; 
		return total += total * CurrencyConverter.IOF / 100; 
	}
}
