package kosa.school;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courseList;//학생이 수강신청한 과목들
	
	
	public Student() {
	}
	public Student(String name) {
		super();
		this.name = name;
		courseList = new ArrayList<Course>();
	}

	//수강신청할 메소드가 필요하다
	public void register(Course c) {
		courseList.add(c);
	}
	
	public void printMemter() {
		System.out.println(" ===================================  ");
		System.out.println("학생이름 : " + name);
		for(Course course : courseList) {
			System.out.println("수상과목 : " + course.getName());
			System.out.println("수상내용 : " + course.getContent());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	


	

}
