package kosa.hotel;

public class Money {
	private int cash;
	private int supyo;
	private int card;
	
	public Money() {
	}

	public Money(int cash, int supyo, int card) {
		super();
		this.cash = cash;
		this.supyo = supyo;
		this.card = card;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getSupyo() {
		return supyo;
	}

	public void setSupyo(int supyo) {
		this.supyo = supyo;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public void show() {
		
	}
}