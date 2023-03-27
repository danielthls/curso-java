import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert String x");
		String x;
		x = sc.next(); //sc.next() lê uma variável tipo String
		
		System.out.println("x = " + x);
		
		int y;
		System.out.println("Insert int y");
		y = sc.nextInt(); //sc.nextInt para númeroes inteiros, não aceita digitar String
		
		System.out.println("y = " + y);  
		
		double z;
		System.out.println("Insert double z");
		z = sc.nextDouble(); //sc.nextDouble para números com decimais. O número deve ser escrito com vírgula para sistemas brasileiros.
							 //Caso queira usar padrão americano, o Locale.setDefault(Locale.US) tem que ser usado ANTES do scanner
		
		System.out.println("z = " + z); //imprime o número com ponto em vez de vírgula
		System.out.printf("z = %.2f%n", z); //usando printf ele imprime com a vírgula
		
		
		char t;
		System.out.println("Insert char a");
		t = sc.next().charAt(0); //Imprime apenas a primeira letra do que for digitado
		System.out.println("a = " + t);
		
		String a;
		int    b;
		double c;
		System.out.println("Digite tudo de uma vez ");
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Resultado");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		
		sc.close(); //Tem que fechar sc ~ parecido com o FreeAndNil do Delphi?
	}

}
