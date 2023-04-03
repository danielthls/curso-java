package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Insert employee name");
		employee.name = sc.nextLine();
		
		System.out.println("Insert employee gross salary");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Insert employee tax");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentageSalary = sc.nextDouble();
		employee.increaseSalary(percentageSalary);
		
		System.out.println("Updated data: " + employee);

	}

}
