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
	
//	public int payCredit(int amount) {
//		if( getBalance() < amount) {
//			System.out.println("대출하시겠습니까? (y|n)");
//			if(privateCredit<amount) {
//				privateCredit = 300000; //대출한도
//				System.out.println("대출되었습니다.");
//				System.out.println("대출 후 남은 금액 : " + (privateCredit - amount));
//			}
//		}
//		return withdraw(amount);
//	}
	
	

}
