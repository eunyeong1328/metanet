package kosa.phone;

public class Company extends PhoneInfo {
	//클래스 만들 때 생성자만 주의하기!!
	private String dept;
	private String position;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void show() {
		super.show();
		System.out.println("부서: " + dept);
		System.out.println("위치: " + position );
	}

}
