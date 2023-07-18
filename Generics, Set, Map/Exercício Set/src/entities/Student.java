package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student>{
	private Integer id;
	private Set<Course> courses = new HashSet();
	private Set<Instructor> instructors = new HashSet();
	
	public Student(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public Set<Course> getCourses(){
		return this.courses; 
	}
	
	public Set<Instructor> getInstructors(){
		return this.instructors;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Set<Course> getClasses() {
		return this.courses;
	}
	
	public void addInstructor(Instructor intructor) {
		this.instructors.add(intructor);
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id);
	}		
	
	@Override
	public int compareTo(Student other) {
		return this.id.compareTo(other.getId());
	}
}
