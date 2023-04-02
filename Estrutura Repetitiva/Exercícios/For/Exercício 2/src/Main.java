import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valor N");
		int N = sc.nextInt();
		int contaIn = 0;
		int contaOut = 0;
		
		if (N > 0) {
			for (int I = 0; I < N; I++) {
				
				int x = sc.nextInt();
				if (x > 9 && x < 21) contaIn++;
				else                 contaOut++;                 
			}
		}
		
		System.out.printf("%d in%n", contaIn);
		System.out.printf("%d out%n", contaOut);
		sc.close();
	}

}
