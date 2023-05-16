package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department name: ");
		Department department = new Department();
		department.setName(sc.nextLine());
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base Salary: ");
		Double workerBase = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBase, department);
		
		System.out.println("How many contracts to this worker? ");
		int numberContracts = sc.nextInt();
		sc.nextLine();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
		
		for (int i = 0; i < numberContracts; i++) {
			System.out.printf("Enter contract #%d data:", i+1);
			System.out.println();
			
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate dateContract = LocalDate.parse(sc.nextLine(), fmt);
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			sc.nextLine();
			worker.addContract(new HourContract(dateContract, valuePerHour, hours));
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String input = "01/" + sc.nextLine(); 
		LocalDate calcDate = LocalDate.parse(input, fmt); 
		
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %d/%d: R$ %.2f%n", calcDate.getMonthValue(), calcDate.getYear(), worker.income(calcDate.getYear(), calcDate.getMonthValue()));
		

		sc.close();
	}

}
