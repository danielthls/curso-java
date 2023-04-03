package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Insert student's name");
		student.name = sc.nextLine();
		
		System.out.println("Insert student's grades");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		System.out.println(student.checkGrade());
		
		sc.close();
	}

}
