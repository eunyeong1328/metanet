package kosa.bank;

public class Account {
	private String id;
	private Long balance;
	
//	public boolean withdraw(Long b) {
//		if(balance < b) {
//			System.out.println("잔액이 부족합니다."); 
//		}else {
//			balance = balance - b;
//		}
//		return false;
//	}
	
	public Account() {
	}
	public Account(String id, Long balance) {
		this.id = id;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	

}
