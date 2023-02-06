package kosa.oop2;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		//Work => Study
		Work work = new Work();
		Study study = new Study();
		
		Person person = new Person("홍길동",new Role() { //자신의 클래스(이름)가 없다 익명내부클래스
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("Driver Role");
			}
		});
				
		person.doIt();

	}

}
