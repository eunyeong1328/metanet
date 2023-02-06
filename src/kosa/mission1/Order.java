package kosa.mission1;

public class Order {
	private int number;
	private Member members;
	private Item items;
	private int numbers;
	private int prices;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int number, Member members, Item items, int numbers) {
		super();
		this.number = number;
		this.members = members;
		this.items = items;
		this.numbers = numbers;
	}
	
	public void show() {
		System.out.println("주문번호 : " + number);
		members.show();
		items.show();
		System.out.println("주문수량 : " + numbers +"개");
		
		prices = numbers * items.getPrice();
		System.out.println("주문금액 : " + prices +"원");
	}
	
	
	
	
	

}
