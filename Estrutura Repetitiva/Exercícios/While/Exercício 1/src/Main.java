import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira número senha");
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida. Insira senha correta");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
