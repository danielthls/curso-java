import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0) {
				if (y > 0) System.out.println("Primeiro");
				else       System.out.println("Quarto");
			}
			else {
				if (y > 0) System.out.println("Segundo");
				else       System.out.println("Terceiro");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
		
	}

}
