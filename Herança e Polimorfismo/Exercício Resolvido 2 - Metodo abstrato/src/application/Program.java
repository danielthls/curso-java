package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>(); 
		
		System.out.print("Enter number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or circle (r/c): ");
			String reply = sc.nextLine();
			System.out.print("Color (BLACK, BLUE, RED): ");
			String color = sc.nextLine();
			if (reply.equalsIgnoreCase("r")) {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double height = sc.nextDouble();
				sc.nextLine();
				shapes.add(new Rectangle(Color.valueOf(color), width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				shapes.add(new Circle(Color.valueOf(color), radius));
			}
		}
		System.out.println();
		System.out.println("SHAPES:");
		for (Shape s: shapes) {
			System.out.printf("%.2f%n",s.area());
		}
		sc.close();
	}

}
