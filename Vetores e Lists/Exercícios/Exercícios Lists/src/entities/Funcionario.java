package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		this.salario += (double) ((salario * porcentagem) / 100);
	}
	
	public String toString() {
		return String.format("Id: %d %nNome: %s %nSalário: R$ %.2f", id, nome, salario);
	}
}
