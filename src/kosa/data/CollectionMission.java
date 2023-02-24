package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또번호 1~45  중복되지 않은 정수 6개 출력
		Random random = new Random();
		System.out.println("배열");
		//1. 배열
		int num[] = new int[6];
		
		for(int i =0; i<num.length; i++) {
			num[i] = random.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) i--;
			}
		}
		
		Arrays.sort(num);
		
		System.out.println();
		
		//2. List(ArrayList) 중복허용
		System.out.println("List(ArrayList)");
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int n = random.nextInt(45) + 1;
			if(list.contains(n)) {
				continue; //중복시 새로 입력 받기
			}else {
				list.add(n);
			}
			
			if(list.size() == 6) break;
			
		}

		Collections.sort(list);
		System.out.println(list);
		
		//3. Set(TreeSet) 중복허용하지 않음
		System.out.println("Set(TreeSet)");
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; set.size()<6; i++) {
			set.add(random.nextInt(45)+1);
		}
		System.out.println(set);
		
		
	}

}
