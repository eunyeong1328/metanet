package kosa.basic;

import java.util.Scanner;

public class Mission3 {
	static int count = 0;
	static Scanner sc = new Scanner(System.in);

	// 메모리가 다른 변수 == 같은 주소 == 같은 값 참조 == 리턴할 필요가 없다
	public static void add(String arr[]) {
		System.out.print("이름: ");
		arr[count++] = sc.nextLine();
	}

	public static void print(String arr[]) {
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i] + ", ");
		}
		System.out.println();
	}

	public static void search(String arr[]) {
		System.out.println("검색 이름: ");
		String str = sc.nextLine();
		int idx = -1;// for문을 다 돌렸는데도 -1,그 값이 없다
		// 없는데 찾으라고 하니까 nullPointException이 생긴다.
		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				idx = i;// 해당 인텍스 찾기
				break;
			}
		}

		if (idx == -1) {// 만약 못 찾는 다면??
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.println((idx + 1) + "번째 있습니다.");
		}

	}

	public static void update(String arr[]) {
		System.out.println("수정 이름: ");
		String str = sc.nextLine();
		int idx = -1;// for문을 다 돌렸는데도 -1,그 값이 없다
		// 없는데 찾으라고 하니까 nullPointException이 생긴다.
		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				idx = i;// 해당 인텍스 찾기
				break;
			}
		}

		if (idx == -1) {// 만약 못 찾는 다면??
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.println("수정할 이름: ");
			arr[idx] = sc.nextLine();
		}
	}

	public static void delete(String arr[]) {
		System.out.println("삭제 이름: ");
		String str = sc.nextLine();
		int idx = -1;// for문을 다 돌렸는데도 -1,그 값이 없다
		// 없는데 찾으라고 하니까 nullPointException이 생긴다.
		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				idx = i; // 해당 인텍스 찾기
				break;
			}
		}

		if (idx == -1) {// 만약 못 찾는 다면??
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			for (int i = idx; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			count--;
		}
	}

	public static void main(String[] args) {
		String arr[] = new String[10];

		while (true) {
			System.out.println("1.추가  2.출력  3.검색(인덱스 수정) 4.수정  5.삭제(중간의 구멍 안됨)  6.종료");
			System.out.print("메뉴 입력: ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				add(arr);
				break;
			case "2":
				print(arr);
				break;
			case "3":
				search(arr);
				break;
			case "4":
				update(arr);
				break;
			case "5":
				delete(arr);
				break;
			case "6":
				System.out.println("프로그램 종료");
				return;
			}
		}

	}
}
