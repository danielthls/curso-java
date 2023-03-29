import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira número");
		numero = sc.nextInt();
		
		if (numero < 0) System.out.println("NÚMERO NEGATIVO");
		else System.out.println("NÚMERO NÃO NEGATIVO");
		
		sc.close();
	}

}
