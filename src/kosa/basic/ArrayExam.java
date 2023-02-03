package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		int brr[] = arr; //주소값이 저장
		
		brr[0] = 10;
		System.out.println("brr: " + brr[0]);
		System.out.println("arr: " + arr[0]);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);//오름차순
		System.out.println(Arrays.toString(arr));

		//내림차순
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[arr.length-1-i] + ", ");
		}
		System.out.println();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		
		System.out.println("2차원 배열");
		
		//2차원 배열
		int arr2[][] = {{2,90},{1,60},{3,20}};
		
		//인터페이스 객체 생성 못함!! 그래서 익명 내부클래스로 만들어야 함
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//정렬기준 작성: 1차원 배열 안에 첫번째 요소를 기준으로 오름차순;
				if(o1[0] < o2[0]) {
					return -1;//자리 이동X
				}else if(o1[0] > o2[0]) {
					return 1; //자리 이동O
				}else {
					return 0;
				}
			}
			
		}); 
		
		System.out.println(Arrays.deepToString(arr2));//2차원 배열일 때 실행
		
		//for뮨
		//인덱스 없이 데이터만 사용할 때 사용
		for(int num :arr) {
			System.out.print(num+",");
		}
	}

}
