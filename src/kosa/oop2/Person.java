package kosa.oop2;

public class Person {
	
	private String name;
	private Role role;//자바는 형변환이 가능하니까 가능
	
	public Person() {};
	
	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public void doIt() {
		role.doing();//코드의 일관성 유지
	}
}
