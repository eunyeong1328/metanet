package kosa.school;

public class Course {
	private String name;
	private String content;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
