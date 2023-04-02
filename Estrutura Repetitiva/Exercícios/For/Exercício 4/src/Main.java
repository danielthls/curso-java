import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valor N");
		int N = sc.nextInt();
		
		if (N > 0) {
			for (int I = 0; I < N; I++) {
				double valor1 = sc.nextDouble();
				double valor2 = sc.nextDouble();
				if (valor2 != 0) {
					double resultado = valor1 / valor2;
					System.out.printf("%.1f%n", resultado);
				}
				else System.out.printf("Divisão impossível");
			}
		}

		sc.close();

	}

}
