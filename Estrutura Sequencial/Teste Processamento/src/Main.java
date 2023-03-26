
public class Main {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		double baseMenor, baseMaior, altura, area;
		baseMenor = 6;
		baseMaior = 8;
		altura    = 5;
		
		area = (baseMenor + baseMaior)/2 * altura;
		
		System.out.println(area);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		resultado = (double) a / b; //(double) converte os valores de int para front
		
		System.out.println(resultado);
		
		double a1;
		int b1;
		
		a1 = 5.0;
		b1 = (int) a1;
		
		System.out.println(b1);
	}

}
