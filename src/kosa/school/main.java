package kosa.school;

public class main {

	public static void main(String[] args) {
		
		Course c = new Course("전산학개론");
		Course c1 = new Course("기초통계학");
		Course c2 = new Course("빅데이터개론");

		
		Student s1 = new Student("이은영");
		Student s2 = new Student("홍길동");
		
		//수강신청
		s1.register(c);
		s1.register(c1);
		//수강취소
		s1.dropCourse(c);
		
		s2.register(c);
		s2.register(c1);
		s2.register(c2);
		
		s1.printMemter();
		s2.printMemter();
		
		//과목별 학생 목록
		System.out.println(" ======== 과목별 학생 목록 ======== ");
		c.printCourse();
		c1.printCourse();
		c2.printCourse();

	}

}
