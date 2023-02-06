package kosa.school;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courseList;//학생이 수강신청한 과목들
	
	public Student() {}
	 
	public Student(String name) {
		super();
		this.name = name;
		courseList = new ArrayList<Course>();
	}

	//수강신청
	public void register(Course course) {
		courseList.add(course);
		//과목별 학생들 추가
		course.addStudent(this);
	}
	
	//수강취소
	public void dropCourse(Course course) {
		if(courseList.contains(course)) {
			courseList.remove(course);
			course.removeStudent(this);
		}
	}
	//print
	public void printMemter() {
		System.out.println(" ===================================  ");
		System.out.println("학생이름 : " + name);
		for(Course course : courseList) {
			System.out.println("수강과목 : " + course.getName());
		}
	}

	public void listPrint() {
		System.out.println(" name 확인 : " + name );
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
