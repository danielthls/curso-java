package entities;

public abstract class Pessoa {
	private String nome;
	protected Double rendaAnual;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getRendaAnual() {
		return this.rendaAnual;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double aliquota();
	
	public abstract Double impostos();
	
}
