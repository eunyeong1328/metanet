package kosa.hotel;

public class Bill {
	private int amount;
	private int paid_cash;
	private int paid_card;
	private int paid_supyo;
	
	public void show(){
		System.out.println("현금 수익: " + paid_cash);
		System.out.println("카드 수익: " + paid_card);
		System.out.println("수표 수익: " + paid_supyo);
		System.out.println("수익 총액: " + amount);
	}
	
	public Bill() {}
	
	public Bill(int amount, int paid_cash, int paid_card, int paid_supyo) {
		super();
		this.amount = amount;
		this.paid_cash = paid_cash;
		this.paid_card = paid_card;
		this.paid_supyo = paid_supyo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPaid_cash() {
		return paid_cash;
	}
	public void setPaid_cash(int paid_cash) {
		this.paid_cash = paid_cash;
	}
	public int getPaid_card() {
		return paid_card;
	}
	public void setPaid_card(int paid_card) {
		this.paid_card = paid_card;
	}
	public int getPaid_supyo() {
		return paid_supyo;
	}
	public void setPaid_supyo(int paid_supyo) {
		this.paid_supyo = paid_supyo;
	}

}