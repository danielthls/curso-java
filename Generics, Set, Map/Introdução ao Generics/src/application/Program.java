package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		PrintService<String> ps = new PrintService<>();
		
		for (int i = 0; i < quantity; i++) {
			ps.addValue(sc.nextLine());
		}
		
		System.out.println(ps.print());
		System.out.println("First: " + ps.getFirst());
		
		//Integer x = ps.getFirst();
		
		sc.close();
	}

}
