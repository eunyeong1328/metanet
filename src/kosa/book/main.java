package kosa.book;


public class main {

	public static void main(String[] args) {
		int totalPrice = 0;
		
		BookVO arr[] = {
			new BookVO("Java",30000),
			new BookVO("JSP",20000),
			new BookVO("Oracle",15000)
		};
		//향상된 for문
		for(BookVO b:arr) {
			b.discount();
			b.printBook();
			totalPrice += b.getDc_price();
		}
		
		System.out.println("총합: " + totalPrice + "원");
	}

	
}
