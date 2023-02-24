package kosa.lamda;

public class LamdaExam {
	
	public static void main(String[] args) {
		//MyType => 익명내부클래스로 구현하시오.
		MyType my1 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("익명 내부클래스");
			}
		};
		
		my1.hello();
		
		//람다식으로 구현
		MyType my2 = ()-> {
			System.out.println("람다식 형식입니다.");
		};
		
		my2.hello();
		
		MyType my3 = () -> System.out.println("향상된 람다식");
		my3.hello();
		
		//파라미터 값  처리
//		YourType you1 = (String message) -> {
//			System.out.println("메세지 : " + message);
//		};
//		
//		you1.talk("안녕");
//		
//		YourType you2 = message -> 	System.out.println("메세지 : " + message);
//		
//		you2.talk("안녕2");
//		
		//MyNumber getMax 구현 큰값 출력
		System.out.println("MyNumber getMax 구현 큰값 출력");
		MyNumber number  = (int a, int b) -> {
			int result = 0; 
			if(true == a>b) {
				System.out.println(a);
			}else if(b>a){
				System.out.println(b);
			}
			return result;
		};
		
		number.getMax(3, 2);
		
		//MyNumber getMax 구현 큰값 출력
		MyNumber number1  = (int a, int b) -> (a>b) ? a:b;
		System.out.println(number1.getMax(3, 7));
		
		Runnable r = () -> {
			for(int i =1; i<=10 ;i++) {
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					e.printStackTrace();
				}
				System.out.print(i + ",");
			}
		};
		
		Thread t = new Thread(r);
		t.run();

		
	}

}
