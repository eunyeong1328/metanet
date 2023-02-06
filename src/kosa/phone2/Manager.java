package kosa.phone2;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10];
	static Scanner sc = new Scanner(System.in);
	int count;

	
	public void addPhoneInfo() {
		System.out.println("1.일반 2.회사 3.동창");
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
			arr[count++] = new PhoneInfo(name, phoneNo, birth);	
			break;
		case "2":
			System.out.print("부서: ");
			String dept = sc.nextLine();
			System.out.print("직책: ");
			String position = sc.nextLine();
			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;
		case "3":
			System.out.print("학과: ");
			String major = sc.nextLine();
			System.out.print("학번: ");
			String year = sc.nextLine();
			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;
		}	
			
	}
	
	public void listPhoneInfo() {
		System.out.println("1.일반 2.회사 3.동창");
		System.out.print("선택: ");
		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			for(int i=0;i<count;i++) {
				arr[i].show();
			}
			break;
		case "2":
			for(int i=0;i<count;i++) {
				if(arr[i] instanceof Company) {
					arr[i].show();
				}
			}
			break;
		case "3":
			for(int i=0;i<count;i++) {
				if(arr[i] instanceof Universe) {
					arr[i].show();
				}
			}
			break;
		}		
	}
	
	public void searchPhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			if(name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("대상이 없습니다.");
		}
		
		
	}
	
	
	
}





