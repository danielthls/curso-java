package entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private List<Student> students = new ArrayList<>();
	private List<Instructor> instructors = new ArrayList<>();
	
	public Course() {
		
	}
	
	public Course(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Student> getStudents() {
		return this.students;
	}
	
	public List<Instructor> getInstructors() {
		return this.instructors;
	}
	
	public void addStudent(Student student) {
		for (Student s: students) {
			if (s.hashCode() == student.hashCode()) {
				if (s.equals(student));
				return;
			}
		}
		student.addCourse(this);
		for (Instructor i: instructors) {
			i.addStudent(student);
			student.addInstructor(i);
		}
		this.students.add(student);
	}
	
	public void addInstructor(Instructor instructor) {
		instructor.addCourse(this);
		this.instructors.add(instructor);
	}
}
