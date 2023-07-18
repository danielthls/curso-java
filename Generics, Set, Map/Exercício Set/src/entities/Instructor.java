package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Instructor {
	private String name;
	private Set<Student> students = new HashSet();
	private Set<Course> courses = new HashSet();
	
	public Instructor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Set<Student> getStudents() {
		return this.students;
	}
	
	public Set<Course> getCourses(){
		return this.courses;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
}
