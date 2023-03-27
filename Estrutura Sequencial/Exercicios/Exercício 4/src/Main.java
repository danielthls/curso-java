import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.println("Insira o número do funcionario");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Insira total de horas trabalhadas");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Insira valor por hora");
		valorHora = sc.nextDouble();
		
		salario = (double) valorHora * horasTrabalhadas;
		
		System.out.printf("NÚMERO: %d%n", numeroFuncionario);
		System.out.printf("SALÁRIO: R$ %.2f%n", salario);
		
		sc.close();
	}

}
