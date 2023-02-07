package kosa.mission4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Manager {
	Stack<String> select = new Stack<String>();
	LinkedList<Food> food = new LinkedList<Food>();
	int total;
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		System.out.println("1.짜장 (6) 2.짬뽕 (7) 3.탕수육 (10) 4.주문종료");
		
		while(true) {
			switch (menu) {
			case "1":
				System.out.println("몇 개를 주문하기겠습니까?");
				
				break;

			default:
				break;
			}
		}
		
	}

}
