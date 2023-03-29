import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Insira números A e B");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b % a == 0 || a % b == 0) System.out.println("São múltiplos");
		else System.out.println("Não são múltiplos");
		
		sc.close();

	}

}
