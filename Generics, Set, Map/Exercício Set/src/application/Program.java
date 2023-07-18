package application;

import java.util.Scanner;

import entities.Course;
import entities.Instructor;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Instructor alex = new Instructor("Alex");
		Course a = new Course("a");
		Course b = new Course("b");
		Course c = new Course("c");
		
		a.addInstructor(alex);
		b.addInstructor(alex);
		c.addInstructor(alex);
		
		addStudents(a);
		addStudents(b);
		addStudents(c);
		
		System.out.println(alex.getStudents().size());
		
		sc.close();
	}
	
	public static void addStudents(Course course) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students for course " + course.getName() +" ? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Insert student code: ");
			course.addStudent(new Student(sc.nextInt()));
			sc.nextLine();
		}
	}

}
