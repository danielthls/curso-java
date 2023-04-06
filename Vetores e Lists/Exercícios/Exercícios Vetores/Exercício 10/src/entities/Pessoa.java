package entities;

public class Pessoa {

	private char genero;
	private double altura;
		
	public Pessoa(char genero, double altura) {

		this.genero = Character.toLowerCase(genero);
		this.altura = altura;
	}
	
	
	public char getGenero() {
		return genero;
	}
	
	public double getAltura() {
		return altura;
	}

	
	public void setGenero(char genero) {
		if (Character.toLowerCase(genero) == 'm') {
			this.genero = genero;
		} else this.genero = 'f';
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
