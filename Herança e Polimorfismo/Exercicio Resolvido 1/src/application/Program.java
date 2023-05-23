package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println(String.format("Employee #%d data", i + 1));
			System.out.print("Outsourced (y/n)? ");
			String reply = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (reply.equalsIgnoreCase("y")) {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
			sc.nextLine();
		}
		
		for (Employee i: employees) {
			System.out.println(i);
		}
		
		sc.close();
	}
		
}
