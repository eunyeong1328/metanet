package kosa.board;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=========================");
			System.out.println("게시판");
			System.out.println("=========================");
			System.out.println("1.글쓰기  2.글목록 보기 3.글세부보기");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				m.write();
				break;
			case "2":
				m.list();
				break;
			case "3":
				m.detail();
				break;
			default:
				return;
			}
		}

	}

}
