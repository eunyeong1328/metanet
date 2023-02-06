package kosa.school;

public class main {

	public static void main(String[] args) {
		
		Student s = new Student("이은영");
		Student s1 = new Student("홍길동");
		
		Course c = new Course("java","java언어"); 
		Course c1 = new Course("c","c언어"); 
		Course c2 = new Course("python","python언어"); 

		s.register(c);
		s.register(c1);
		
		s1.register(c1);
		
		s.printMemter();
		s1.printMemter();

	}

}
