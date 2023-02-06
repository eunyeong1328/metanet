package kosa.mission1;

public class Item {
	private String modelName;
	private int price;
	public Item() {
		super();
	}
	public Item(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void show() {
		System.out.println("주문한 상품 모델명 : " + modelName);
		System.out.println("주문한 상품 가격 : " + price + "원");
	}
	
	

}
