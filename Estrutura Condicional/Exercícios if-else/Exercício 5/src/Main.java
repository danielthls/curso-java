import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valorUnitario = 0, total = 0;
		
		System.out.println("Tabela código e preços");
		System.out.println("Código | Especificação   | Preço  ");
		System.out.println("1      | Cachorro Quente | R$ 4,00");
		System.out.println("2      | X-Salada        | R$ 4,50");
		System.out.println("3      | X-Bacon         | R$ 5,00");
		System.out.println("4      | Torrada Simples | R$ 2,00");
		System.out.println("5      | Refrigerante    | R$ 1,50");
		
		System.out.println("");
		System.out.println("Insira o código e a quantidade");
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		if (quantidade < 1) System.out.println("Quantidade inválida.");
		else if (codigo > 0 && codigo < 6){
			if (codigo == 1)      valorUnitario = 4.00;
			else if (codigo == 2) valorUnitario = 4.50;
			else if (codigo == 3) valorUnitario = 5.00;
			else if (codigo == 4) valorUnitario = 2.00;
			else if (codigo == 5) valorUnitario = 1.50;
			
			total = (double) valorUnitario * quantidade;
			
			System.out.printf("Total : R$ %.2f%n", total);
		}
		else System.out.println("Código inválido.");
		
		
		
		sc.close();

	}

}
