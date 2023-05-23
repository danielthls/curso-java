package entities;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return this.gastosSaude;
	}
	
	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	public Double descontos() {
		return gastosSaude / 2;
	}
	
	@Override
	public final Double aliquota() {
		// TODO Auto-generated method stub
		if (this.rendaAnual >= 20000.0) {
			return 0.25;
		}
		return 0.15;
	}

	@Override
	public final Double impostos() {
		// TODO Auto-generated method stub
		return (this.rendaAnual * aliquota()) - descontos(); 
	}
	
}
