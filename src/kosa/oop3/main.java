package kosa.oop3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj[] = {
				new Reader("둘리"),
				new Worker("길동"),
				new Student("마이콜")
		};
		
		for(int i =0; i<obj.length; i++) {
			if(obj[i] instanceof Speakable) {
				Speakable obj2 = (Speakable) obj[i];
				System.out.println(obj2.speak());
			}
		}

	}

}
