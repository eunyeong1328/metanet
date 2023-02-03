package kosa.basic;

import java.util.Arrays;

public class Mission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//여러명의 성적을 관리할 수 있는 프로그램을 구현해보자
		//키보드로 부터 각 과목별로 점수를 선언해서 구현하자
		//
		//번호 국어 영어 수학    총점     평균
		//1  90  98 91  290  95
		//2  21  45 43  180  45

		
		int num[][] = {
				{90,98,91},
				{21,45,43}
		};
		System.out.println("국어 영어 수학 :  총점  평균");
		System.out.println("===================");
		int sum = 0;
		int avg = 0;
		for(int i=0; i<num.length; i++) {
			int inum[] = num[i]; //0,1
//			System.out.println(Arrays.toString(inum));
			for(int j=0; j<inum.length; j++) {
				int jnum = inum[j];
				System.out.print(jnum + ",");
				sum = sum + jnum;
				avg = sum/inum.length;
			}
			System.out.print("   "+ sum);
			System.out.println("  "+ avg);
		}
		
		
	}

}
