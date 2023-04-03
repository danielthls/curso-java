import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valor N");
		int N = sc.nextInt();
		if (N > 0) {
			for (int I = 1; I <= N; I++) {
				int quadrado = (int) Math.pow(I, 2);
				int cubo = (int) Math.pow(I, 3);
				System.out.printf("%d %d %d%n5", I, quadrado, cubo);
			}
		}
		sc.close();

	}

}
