package kosa.oop;

public class main {
	public static void main(String[] args) {
//		Account account = new Account("1111-1111","홍길동",1000);
//		Account account2 = new Account("2222-2222","홍길동",5000);
//
//		account2.withdraw(3000);
//		account2.printAccount();
//		
//		//account.balance = 5000; //더이상 접근이 안 된다 <= 캡슐화하였기 때문
//		account.setBalance(5000);
//		
		CheckingAccount ca = new CheckingAccount("111-111","홍길동",10000,"111-111");
		
		try {
			System.out.println();
			ca.pay("111-111", 300);
			System.out.println();
		}catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}finally {
			System.out.println();
		}
		System.out.println();
		
		ca.printAccount();
	}
}
