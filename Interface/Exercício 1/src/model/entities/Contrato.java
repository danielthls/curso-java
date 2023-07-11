package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private Integer numero;
	private LocalDate dataContrato;
	private Double valor;
	
	private List<Parcela> parcelas = new ArrayList<>();
	
	public Contrato() {
	}
	
	public Contrato(Integer numero,  LocalDate data, Double valor) {
		this.numero = numero;
		this.dataContrato = data;
		this.valor = valor;
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	public LocalDate getDataContrato() {
		return this.dataContrato;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setDataContrato(LocalDate data) {
		this.dataContrato = data;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void adicionarParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public void removerParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número do contrato: " + this.numero + "\n");
		sb.append("Data: " + this.dataContrato.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n\n");
		int contador = 0;
		for (Parcela p: parcelas) {
			contador ++;
			sb.append("Parcela " + contador + "\n");
			sb.append(p);
		}
		return sb.toString();		
	}
}
