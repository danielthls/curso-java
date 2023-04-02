import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o tipo de combustível: 1 - Álcool, 2 - Gasolina, 3 - Diesel");
		
		int resposta = sc.nextInt();
		int contaGas = 0;
		int contaAlc = 0;
		int contaDie = 0;
		
		while (resposta != 4) {
			switch (resposta) {
			case 1: 
				contaAlc += 1;
				break;
			case 2: 
				contaGas += 1;
				break;
			case 3: 
				contaDie += 1;
				break;
			}
			System.out.println("Escreva o tipo de combustível: 1 - Álcool, 2 - Gasolina, 3 - Diesel");
			resposta = sc.nextInt();
			
		}
		
		System.out.printf("MUITO OBRIGADO! %nÁlcool: %d %nGasolina: %d %nDiesel: %d", contaAlc, contaGas, contaDie);
		
		sc.close();
	}

}
