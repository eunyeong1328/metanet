package kosa.book;

public class BookVO {
	//상태: 책이름, 정가, 할인된 가격
	//기능: 할인된 가격 산출, 책 정보 출력
	private String bookName;
	private int price;
	private int dc_price;
	
	public BookVO() {
	}

	public BookVO(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}

	public void discount() {
		if(price>=30000) {
			dc_price = (int) (price * 0.75);
		}else if(price>=20000) {
			dc_price = (int) (price * 0.80);
		}else if(price>=15000) {
			dc_price = (int) (price * 0.85);
		}
	}
	
	public void printBook() {
		System.out.println(bookName + "교재의 정가는" + price + "원 할인된 가격은" + dc_price + "원 입니다.");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}
	
}
