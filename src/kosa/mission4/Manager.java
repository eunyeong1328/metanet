package kosa.mission4;

import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	LinkedList<Order> orders = new LinkedList<Order>();
	
	Food food1 = new Food("짜장면",6);
	Food food2 = new Food("짬뽕",7);
	Food food3 = new Food("탕수육",10);
	
	public void addSelect() {
		System.out.println("주문메뉴를 골라주세요");
		while(true) {
			System.out.println("1번.짜장6원  2번.짬뽕7원  3번.탕수육 10원  4.주문완료");
			String addmenu = sc.next();
			switch (addmenu) {
			case "1":
				System.out.println("몇 개를 주문하시겠습니까?");
				int one = sc.nextInt();
				orders.add(new Order(food1,one));
				break;
			case "2":
				System.out.println("몇 개를 주문하시겠습니까?");
				int two = sc.nextInt();
				orders.add(new Order(food2,two));
				break;
			case "3":
				System.out.println("몇 개를 주문하시겠습니까?");
				int three = sc.nextInt();
				orders.add(new Order(food3,three));
				break;
			case "4":
				return;
			}
		}
		
	}

	public void print() {
		if (!orders.isEmpty()) {
			for (int i = 0; i < orders.size(); i++) {
				orders.get(i).getFood().show();
				System.out.print(", 갯수:" + orders.get(i).getAmount());
				System.out.println();
			}
		} else {
			System.out.println("확인된 주문이 없습니다.");
		}
	}

	public void totalAccount() {

		while (!orders.isEmpty()) {
//			for (int i = 0; i < orders.size(); i++) {
//				sum += orders.get(i).total();
//			}
//			for (int i = 0; i < orders.size(); i++) {
//				orders.poll().payorders(i);
//			}
//			for(orders o : )
//			orders.poll().show();
			break;
		}

	}

}
