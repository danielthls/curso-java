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
				double valor3 = sc.nextDouble();
				double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5);
				System.out.printf("%.1f", media);
			}
		}

		sc.close();
	}
}
