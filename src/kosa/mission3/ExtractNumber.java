package kosa.mission3;

import java.util.Scanner;

public class ExtractNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		String num = sc.nextLine();
		
		if(num.length() < 10 ) {
			System.out.println("문자열의 길이를 줄여주세요");
		}else {
			num.lastIndexOf(result);
			System.out.println("문자열의 길이" + num);
		}
		
	}

}
