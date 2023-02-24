package kosa.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로 수학수식을 입력
		// ((2+3)+10) => 괄호 일치/불일치 판단
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();

		System.out.println("수식 입력: ");
		String str = sc.nextLine();
		System.out.println(str.length());

		// 예외처리
		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '(') {
					stack.push(ch + " ");
				} else if (ch == ')') {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				System.out.println("괄호가 일치한다.");
			} else {
				System.out.println("괄호가 불일치한다.");
			}

		} catch (Exception e) {
			System.out.println("괄호가 불일치한다.");
		}
		
		
//		//3. Set(TreeSet)
//				//기본 정렬 조건 : Comparable -> compareTo() 오버라이딩
//				//정렬 기준 변경 : Comprator -> compare() 오버라이딩
//				Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
//
//					@Override
//					public int compare(Integer o1, Integer o2) {
//						//내림차순 정렬기준 정의
//						if(o1<o2) {
//							return 1;
//						}else if (o1>o2) {
//							return -1;
//						}
//						return 0;
//					}
//				});
//				
//				Set<Integer> set = new TreeSet<Integer>((Integer o1, Integer o2)-> o2-o1);
//				
//				for(int i=0; set.size()<6; i++) {
//					set.add(r.nextLine(45)+1);
//				}
//				
//				//comparable 최초의 정렬

	}

}
