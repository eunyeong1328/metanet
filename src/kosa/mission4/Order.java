package kosa.mission4;

public class Order {
	private Food food;//음식
	private int amount; //갯수
	private int allPrice;//주문금액
	
	public Order() {}
	
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
	}
	
	//총액 출력
//	public int total() {
//		int totalPrice = food.getPrice() * amount;
//		return totalPrice;
//	}
	
	public int payOrder(int amount) {
		allPrice = amount * food.getPrice();
		return allPrice;
	}

	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void show() {
		System.out.println("가격은 총: " + amount + "원 입니다");
	}
}
