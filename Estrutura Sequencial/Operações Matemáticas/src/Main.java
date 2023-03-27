
public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		System.out.println("A raiz quadrada de " + x + " é " + A);
		System.out.println("A raiz quadrada de " + y + " é " + B);
		System.out.println("A raiz quadrada de " + 25 + " é " + C);
		System.out.println();
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(z, 2.0);
		System.out.println(x + " elevado a " + y   + " = " + A);
		System.out.println(x + " elevado a " + 2.0 + " = " + B);
		System.out.println(z + " elevado a " + 2.0 + " = " + C);
		System.out.println();
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O valor absoluto de " + y + " é " + A); 
		System.out.println("O valor absoluto de " + z + " é " + B); 
		
		double delta;
		double x1;
		double x2;
		
		A = 4.0;
		B = 16.0;
		C = 9.0;
		
		delta = (Math.pow(B, 2.0)) - (4 * A * C);
		x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		x2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		
		System.out.println("O valor de delta é " + delta);
		System.out.println("O valor de x1 é " + x1);
		System.out.println("O valor de x2 é " + x2);
		
	}

}
