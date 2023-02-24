package kosa.mission2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("============야구게임============");
		System.out.println("임의수 3자리를 입력해주세요!!");
		int my1 = sc.nextInt();
		int my2 = sc.nextInt();
		int my3 = sc.nextInt();
		
		int myList[] = {my1,my2,my3};
		
		Random random = new Random();
//		int num1 = random.nextInt(10);
//		int num2 = random.nextInt(10);
//		int num3 = random.nextInt(10);
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		
		
		int randomNum[] = {num1,num2,num3};
		
		int outcome = 0; 
		while(true) {
			if(Arrays.equals(myList,randomNum)) {
				outcome++;
				System.out.println(outcome + "번째 성공");
				return; 
			}else{
				outcome++;
				System.out.println("다시 입력");
			}
		}
	


	}

}
