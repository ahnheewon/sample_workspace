package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx { 
	public static void main(String[] args) {
		//데이터 저장 => 배열.
		//컬렉션 ArrayList => 인덱스 값 지정, 동일한 값 다른 인덱스.
		//컬렉션 HashSet => 인덱스 값 지정(X), 동일한 값 저장 (X)
		System.out.println("==========HashSet=========");
		// P.567
		HashSet<String>set =new HashSet<>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		
		System.out.println(set.size()); // size가 3이아닌 2 , 중복값을 담지 않았다.
		
		// P.565
		Iterator<String> iter = set.iterator(); 
		while(iter.hasNext()) { // hasNext : 컬렉션에서 가지고 올 요소가 있는 지 체크합니다.
			System.out.println(iter.next()); //next : 요소 선택
		}
		
		
		System.out.println("========ArrayList=========");
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		
		System.out.println(list.size()); // size가 3, 중복값도 담는다.
		for (int i=0; i< list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}

}
