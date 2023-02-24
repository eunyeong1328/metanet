package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10; i++) {
			list.add(i);
		}
		
//		list.forEach(i -> System.out.print(i + ","));
		
		String arr[] = {"aa","bb","cc"};//배열
		List<String> list2 = Arrays.asList(arr); //array => list
		
		//스트림 출력
		Stream<String> stream1 = Arrays.stream(arr);
		Stream<String> stream2 = list2.stream();
		stream1.sorted().forEach(System.out::println);
		stream2.sorted().forEach(System.out::println);
	}

}
