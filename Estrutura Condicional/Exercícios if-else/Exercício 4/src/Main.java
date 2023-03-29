import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracaoPartida;
		
		System.out.println("Insira horas de início e fim do jogo");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		
		if (horaInicial < horaFinal) duracaoPartida = horaFinal - horaInicial;
		
		else       duracaoPartida = ((24 + horaFinal) - horaInicial);
		
		System.out.printf("O JOGO DUROU %d HORAS", duracaoPartida);
		sc.close();

	}

}
