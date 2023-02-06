package kosa.oop;

public class MinusAccount extends Account{
	private int creditLine; //마이너스 한도
	
	public MinusAccount() {}
	
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	//withdraw를 호출해서 사용 (내가 그 메소드를 새롭게 정의)
	@Override
	public int withdraw(int amount) throws Exception {
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		
		int balance = getBalance();
		setBalance(balance-amount);
		return amount;
	}
	
}
