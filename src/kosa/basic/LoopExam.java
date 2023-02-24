package kosa.basic;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//"2개의 정수를 입력 받아 b-a 결과가 항상 양의 정수가 나오도록 구현해보자"
		System.out.print("정수 입력: ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		//오직 while문 만 사용하자면
		while(true) {
			int result = b - a;
			if(result>0) {
				System.out.println("결과 :" + result);
			}else {
				System.out.println("결과 :" + -result);
			}
			break;
		}
		
	}

}
