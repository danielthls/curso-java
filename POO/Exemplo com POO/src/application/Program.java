package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triângulo x");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo y");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Área do triângulo X = %.4f%n", x.area());
		System.out.printf("Área do triângulo Y = %.4f%n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Área do triângulo X é maior");
		} else if (x.area() < y.area()){
			System.out.println("Área do triângulo Y é maior");
		} else {
			System.out.println("Áreas dos dois triângulos é igual");
		}
		
		sc.close();

	}

}
