package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC;
		double yA, yB, yC;
		
		System.out.println("Insira as medidas do triângulo x");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo y");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double xArea = areaResult(xA, xB, xC);
		double yArea = areaResult(yA, yB, yC);
		
		System.out.printf("Área do triângulo X = %.4f%n", xArea);
		System.out.printf("Área do triângulo Y = %.4f%n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Área do triângulo X é maior");
		} else if (xArea < yArea){
			System.out.println("Área do triângulo Y é maior");
		} else {
			System.out.println("Áreas dos dois triângulos é igual");
		}
		
		sc.close();
	}
	
	public static double pResult(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return p;		
	}

	public static double areaResult(double a, double b, double c) {
		double p = pResult(a, b, c);
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
}
