package kosa.mission1;

public class Member {
	private String name;
	private String address;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public void show() {
		System.out.println("회원이름 : " + name);
		System.out.println("회원주소 : " + address);
	}
	
}
