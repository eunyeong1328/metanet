package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class MemberMain {

	public static void main(String[] args) {
		//List에 Member객체 3개를 추가
		//stream을 이용해서 출력해보기.
//		
//		List<Member> list = new ArrayList<Member>();
//		IntStream.range(0, 3).forEach(i->list.add(new Member("user" + i,20)));
//		
//		list.stream().forEach(member->System.out.println(member.getName()));
		
		Map<String, String> map = 
				new HashMap<String, String>();
		map.put("1","SSG");
		map.put("2","키움");
		map.put("3","Lg");
		
		System.out.println("요소의 사이트 : " + map.size());
		if(map.containsValue("SSG")) {
			map.remove("1");
		}
		
		System.out.println("요소의 사이즈: " + map.size());
		System.out.println(map.get("3"));
		
		//Map 전체 목록 출력(key, value)
		//Map => Set => Iterator
		//key -> keySet() : 키값만 출력
		//value -> values : Collection
		//(key, value) -> entrySet() : key,value 모두 추출
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next(); //한쌍의 값을 받음
			//한쌍의 데이터 타입을 Map.entry로 표현했다.
			System.out.println("key: " + e.getKey() + ", value" + e.getValue());
		}
		
		
 
	}

}
