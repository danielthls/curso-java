import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int inicioIntervalo, fimIntervalo;
		
		System.out.println("Insira valor");
		valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) System.out.println("Fora do intervalo");  
		
		else {
			if (valor >= 0 && valor <= 25) {
				inicioIntervalo = 0;
				fimIntervalo = 25;
			} else if (valor > 25 && valor <= 50) {
				inicioIntervalo = 25;
				fimIntervalo = 50;
			} else if (valor >= 50 && valor <= 75) {
				inicioIntervalo = 50;
				fimIntervalo = 75;
			} else {
				inicioIntervalo = 75;
				fimIntervalo = 100;
			}
			System.out.printf("Intervalo [%d, %d]", inicioIntervalo, fimIntervalo);
		}
			
		
		sc.close();


	}

}
