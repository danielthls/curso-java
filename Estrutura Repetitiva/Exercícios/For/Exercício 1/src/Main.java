import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira número entre 1 e 1000");
		int x = sc.nextInt();
		
		if (x >= 1 && x <= 1000) {
			for (int I = 1; I <= x; I++) {
				if (I % 2 != 0) System.out.println(I);
			}
		}
		
		sc.close();
	}

}
