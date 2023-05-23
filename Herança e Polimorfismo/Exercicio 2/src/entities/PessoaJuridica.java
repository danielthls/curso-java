package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}
	
	public Integer getFuncionarios() {
		return this.funcionarios;
	}
	
	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public final Double impostos() {
		// TODO Auto-generated method stub
		return this.rendaAnual * aliquota();
	}

	@Override
	public final Double aliquota() {
		// TODO Auto-generated method stub
		if (this.funcionarios > 10) {
			return 0.14;
		}
		
		return 0.16;
	}

}
