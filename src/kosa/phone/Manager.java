package kosa.phone;

import java.util.Scanner;

public class Manager {
	int count; //0정수 |  0.0실수 |   null
	static Scanner sc = new Scanner(System.in);

	PhoneInfo arr[] = new PhoneInfo[10];
	
	//로컬은 초기화 = 지역변수는 그 범위의 메모리에서 없어짐
	//객체는 레벨이 다르다. 멤버변수 필드는 초기화할 필요가 없다
	public void add() {
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("전화번호: ");
		String phoneNo = sc.nextLine();;
		System.out.println("생년월일: ");
		String birth = sc.nextLine();
		
		arr[count++] = new PhoneInfo(name,phoneNo,birth);
	}
	
	public void print() {
		for(int i=0; i<count; i++) {
			arr[i].show();
		}
		System.out.println();
	}
	
	public void search() {
		System.out.println("검색 이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i=0; i<count; i++) {
			if(name.equals(arr[i].getName())){
				arr[i].show();
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 검색어가 존재하지 않습니다.");
		}else {
			System.out.println((idx + 1) +"번째 있습니다.");
		}
		
	}
	
}
