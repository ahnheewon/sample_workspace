package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> que	=	new	LinkedList<>();
		
		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");

		while(!que.isEmpty()) { // que안에 객체가 없으면 반복 끝
			
			String result = que.poll(); //객체 하나를 가져옵니다. 선입선출 
			System.out.println(result);
		}
	
	}

}
