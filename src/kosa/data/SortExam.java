package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동",20));
		list.add(new Person("박길동",60));
		list.add(new Person("김길동",80));
		list.add(new Person("이길동",30));
		
		Collections.sort(list,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				//이름을 기준으로 오름차순
				//음수 -> aa.compareTo(bb)
				//양수 -> aa.compareTo(aa)
				if(o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				}else if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}

			
			
		});
//		System.out.println(list.toString());
		System.out.println(list);
	}

}
