package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		//마지막에 들어온 것이 가장 먼저 나감
		Stack<Integer> s = new Stack<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>(); 
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println("---stack----");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		System.out.println("---Queue----");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
