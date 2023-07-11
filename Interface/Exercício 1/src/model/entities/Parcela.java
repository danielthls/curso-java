package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	private Double valor;
	private Double juros;
	private Double taxa;
	private LocalDate vencimento;
	
	public Parcela() {
	}
	
	public Parcela(Double valor, Double juros, Double taxa, LocalDate vencimento) {
		this.valor = valor;
		this.juros = juros;
		this.taxa = taxa;
		this.vencimento = vencimento;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public Double getJuros() {
		return this.juros;
	}
	
	public Double getTaxa() {
		return this.taxa;
	}
	
	public LocalDate getVencimento() {
		return this.vencimento;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}
	
	public Double getValorTotal() {
		return this.getValor() + this.getJuros() + this.getTaxa();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vencimento: " + this.vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
		sb.append("Valor da parcela: " + String.format("R$ %.2f", getValorTotal()) + "\n");
		return sb.toString();
	}
}
