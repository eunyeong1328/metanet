package kosa.oop;
//겍체 추상화하는 작업
public class Account {
	//계좌객체
	//상태(필드):계좌번호, 계좌주, 잔액 => 멤버변수
	//기능(메서드): 입금하다, 출금하다
	//캡슐화=>정보의 은닉을 위해서
	private String accountNo;
	private String ownerName;
	private int balance;
	//메모리에 올라오지 않아서 사용이 불가능 == 별도의 메모리 공간이 할당
	public Account() {	}	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance<amount) {
			return 0;
		}
		balance -= amount;
		
		return amount;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}
}
