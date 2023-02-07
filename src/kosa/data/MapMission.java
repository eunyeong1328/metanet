package kosa.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름,점수를 한쌍으로 Map 자료구조를 구현하자.
		//=> 김자바 : 80, 박자바 : 30
		//1. 시험 응시자만 출력
		//2. 총점, 평균, 최고점수, 최저점수 : Collections => max(), min()
		//내코드
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		map.put("김자바", 80);
//		map.put("박자바", 30);
//	
//		
//		Set set = map.entrySet();
//		Iterator iter = set.iterator();
//		int sum = 0;
//	
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(iter.hasNext()) {
//			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter.next(); 
//			System.out.println("key: " + e.getKey() + ", value" + e.getValue());
//			sum += e.getValue();
//			list.add(e.getValue());
//		}
//		
//		int avg = sum/map.size();
//		
//		System.out.println("총점: "+sum+"평균: "+avg+"최고점수: "+Collections.max(list)+"최저점수: "+Collections.min(list));

		//강사님 코드
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("김자바", 80);
		map.put("박자바", 30);
	
		//map => key
		Set<String> set = map.keySet();
		System.out.println("응시자명단: " + set);
		
		//map => value
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total = 0;
		while(iter.hasNext()) {
			total+=iter.next();
		}
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ total/map.size());
		System.out.println("최고점수: "+ Collections.max(values));
		System.out.println("최저점수: "+ Collections.max(values));
	}

}
