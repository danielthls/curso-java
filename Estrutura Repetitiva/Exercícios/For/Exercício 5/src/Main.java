import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valor N");
		int N = sc.nextInt();
		int fatorial = N;
		if (N == 0) fatorial = 1;
		if (N > 0) {
			for (int I = N - 1; I > 0; I--) {
				
				int anterior = I;
				if (anterior == 0) anterior = 1;  
				fatorial = fatorial * (anterior);
			}
		}
		System.out.println(fatorial);
		sc.close();

	}

}
