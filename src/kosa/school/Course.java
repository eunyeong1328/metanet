package kosa.school;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private List<Student> students;
	
	public Course() {
		super();
	}
	public Course(String name) {
		super();
		this.name = name;
		students = new ArrayList<Student>();
	}
	
	//학생 추가
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//학생 삭제
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	//print
	public void printCourse() {
		System.out.println("과목명 : " + name);
		for(Student student : students) {
			System.out.println("수강과목 : " + student.getName());
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
