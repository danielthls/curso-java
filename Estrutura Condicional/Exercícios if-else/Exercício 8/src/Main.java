import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
				
		System.out.println("Insira salario");
		salario = sc.nextDouble();
		
		if (salario < 0) System.out.println("Valor inválido");
		else if (salario <= 2000) System.out.println("Isento");
		else if (salario > 2000) {
			double limiteImposto = salario - 2000;
			if (limiteImposto > 1000) limiteImposto = 1000; 
			imposto = (limiteImposto * 8)/100;
			System.out.println(imposto);
			if (salario > 3000) {
				limiteImposto = salario - 3000;
				if (limiteImposto > 1500) limiteImposto = 1500;
				imposto = imposto + (limiteImposto * 18) / 100;
				System.out.println(imposto);
				if (salario > 4500) {
					imposto = imposto + ((salario - 4500) * 28) / 100;
					System.out.println(imposto);
				}
			}
			System.out.printf("Imposto: R$ %.2f", imposto);
		}
		
		
		
		sc.close();

	}

}
