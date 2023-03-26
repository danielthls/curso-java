import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4387.898687;

		System.out.println("Zug zug");
		System.out.println("Teste");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // %.<numero de casas decimais>f e depois %n para quebrar linha
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado: " + x + " metros");
		System.out.printf("Resultado: %.2f metros%n", x);

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês%n", nome, idade, renda); // %s String %d Integer
	}

}
