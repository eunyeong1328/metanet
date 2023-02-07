package kosa.mission4;

public class Order {
	private Food food;
	private int amount; //총액
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Food food) {
		super();
		this.food = food;
		this.amount = amount;
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
	
	

}
