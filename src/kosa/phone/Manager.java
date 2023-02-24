package kosa.phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	int count; // 0정수 | 0.0실수 | null
	static Scanner sc = new Scanner(System.in);

//	PhoneInfo arr[] = new PhoneInfo[10];
	List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	// 로컬은 초기화 = 지역변수는 그 범위의 메모리에서 없어짐
	// 객체는 레벨이 다르다. 멤버변수 필드는 초기화할 필요가 없다
	public void add() {
		System.out.print("1.일반 2.회사 3.동창");
		System.out.print("선택: ");
		String menu = sc.nextLine();

		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();

		switch (menu) {
		case "1":
			list.add(new PhoneInfo(name, phoneNo, birth));
			break;
		case "2":
			System.out.print("부서: ");
			String dept = sc.nextLine();
			System.out.print("직책: ");
			String position = sc.nextLine();
			list.add(new Company(name, phoneNo, birth, dept, position));
			break;
		case "3":
			System.out.print("학과: ");
			String major = sc.nextLine();
			System.out.print("학번: ");
			String year = sc.nextLine();
			list.add(new Universe(name, phoneNo, birth, major, year));
			break;
		}
	}
	
	public void print() {
		System.out.println("1.일반 2.회사 3.동창");
		System.out.println("선택: ");
		String menu = sc.nextLine();
		Iterator<PhoneInfo> iter = list.iterator();//point 같은 함수로서 지역변수에서 사용이 가능하다.;
		
		switch (menu) {
		case "1":
			while(iter.hasNext()) {
				PhoneInfo p = iter.next();
				p.show();
			}
			
			break;
		case "2":
			while(iter.hasNext()) {
				PhoneInfo p = iter.next();
				if (p instanceof Company) {
					p.show();
				}
			}
			break;
		case "3":
			while(iter.hasNext()) {
				PhoneInfo p =  iter.next();
				if (p instanceof Universe) {
					p.show();
				}
			}
			break;
		}
	}

	public void search() {
		System.out.println("검색 이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				list.get(i).show();
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("해당 검색어가 존재하지 않습니다.");
		} else {
			System.out.println((idx + 1) + "번째 있습니다.");
		}

	}

}
