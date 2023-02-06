package kosa.oop2;

public class main {

	public static void main(String[] args) {
		//Work => Study
		Work work = new Work();
		Study study = new Study();
		
		Person person = new Person("홍길동",study);
		person.doIt();

	}

}
