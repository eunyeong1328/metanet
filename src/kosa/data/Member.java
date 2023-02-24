package kosa.data;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	

}
