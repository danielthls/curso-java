package model.services;

public class ServicoPagamentoPaypal implements ServicoPagamento {
	
	final double juros = 0.01;
	final double taxa = 0.02;
	
	
	public Double calcularJuros(double valor, int parcela) {
		return (valor * juros) * parcela;
	}
	
	public Double calcularTaxa(double valor, int parcela) {
		return (valor + calcularJuros(valor, parcela)) * taxa;
	}
}
