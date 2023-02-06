package kosa.phone2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.추가  2.출력   3.검색  4.종료
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가  2.출력   3.검색  4.종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				
				break;
			case "4":
			
				return;
			}
		}
	}

}







