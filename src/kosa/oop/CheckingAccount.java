package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); //부모클래스의 생성자 호출
		this.cardNo = cardNo;//
	}
	
		public int pay(String cardNo, int amount) throws Exception {
			if(!cardNo.equals(this.cardNo) || getBalance() < amount) { //같은 클래스가 아니어서 balance사용 불가
				throw new Exception("결재 불능"); //throw에서 강제로 예외처리
			}
			
			return withdraw(amount);
		}

}
