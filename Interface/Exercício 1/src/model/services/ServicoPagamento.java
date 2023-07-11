package model.services;

public interface ServicoPagamento {
	public Double calcularJuros(double valor, int parcela);
	public Double calcularTaxa(double valor, int parcela);
}
