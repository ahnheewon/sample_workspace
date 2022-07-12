package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set (인터페이스) => HashSet, TreeSet
 * 
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기");

		System.out.println("크기 : " + set.size()); // 중복된 "딸기"는 저장되지 않았음.

		set.remove("딸기");
		System.out.println(set.contains("딸기")); // 해당되는 요소가 있는지 체크, 삭제되었으므로 false

		if (set.isEmpty()) {
			System.out.println("컬렉션이 비어있음.");
		}

		// 반복요소 처리.
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // 가지고 올 요소가 있는지 체크해주는 hasNext()
			String val = iter.next();
			System.out.println(val);

		}
		// 반복처리.
		iter = set.iterator(); // 반복자를 획득.
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		
		//확장 for.
		for (String val : set) {
			System.out.println(val);
		}
	}
}
