package kosa.mission4;

public class Food {
	private String foodName;
	private String price;
	
	public Food() {
		super();
	}
	public Food(String foodName, String price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}
	
	public void show() {
		System.out.println("1.짜장면(6) 2.짬뽕(7) 3.탕수육(12)");
	}
	
	public void foodSelect() {
		System.out.println("음식 : " + foodName);
		System.out.println("가격 : " + price);
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
