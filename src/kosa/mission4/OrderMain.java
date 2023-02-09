package kosa.mission4;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while(true) {
			System.out.println("=============================");
			System.out.println("1.주문  2.주문 처리  3.매출액 총액 4.종료 ");
			System.out.println("=============================");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				m.addSelect();
				break;
			case "2":
				m.print();
				break;	
			case "3":
				m.totalAccount();
				break;
			case "4":
				return;
			}
		}
	}
}
