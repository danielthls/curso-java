import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2;
		int qnt1, qnt2;
		double valorUn1, valorUn2, total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		valorUn1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		valorUn2 = sc.nextDouble();
		
		total = (double) (qnt1 * valorUn1) + (qnt2 * valorUn2);
		
		System.out.printf("Código 1: %d%n", cod1);
		System.out.printf("Quantidade 1: %d%n", qnt1);
		System.out.printf("Valor un 1: %f%n", valorUn1);
		
		System.out.printf("Código 2: %d%n", cod2);
		System.out.printf("Quantidade 2: %d%n", qnt2);
		System.out.printf("Valor un 2: %f%n", valorUn2);
		
		System.out.printf("Valor total: R$ %.2f%n", total);
		
		sc.close();

	}

}
