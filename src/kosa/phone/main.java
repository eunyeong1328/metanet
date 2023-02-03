package kosa.phone;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.println("메뉴 입력: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				m.add();
				break;
			case "2":
				m.print();
				break;
			case "3":
				m.search();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
