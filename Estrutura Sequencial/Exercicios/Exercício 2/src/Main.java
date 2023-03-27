import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
