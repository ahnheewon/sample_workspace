package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();
		list.add("사과");
		list.add(100);

//		for (int i = 0; i < list.size(); i++) {
//			String result = (String) list.get(i);
//			System.out.println(result);
//		}
		// List 컬렉션. List (인터페이스) => ArrayList, LinkedList, Vector
		List<String> sList = new ArrayList<>();
		sList.add("홍길동");
		sList.add("김민기");
		String result = sList.get(1); // 값을 읽어올 때.
		sList.remove(0); // 값을 삭제.
		sList.set(0, "황길동");
		sList.add("김민기");
		sList.add("김민기");
		sList.add("김민기");

		Iterator<String> iter = sList.iterator(); // 반복자 생성.
		while (iter.hasNext()) { // 요소의 존재여부를 체크
			String val = iter.next(); // 요소를 갖고 오는 메소드.
			System.out.println(val);
		}

	//index 기반으로 요소를 저장.
		for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		// 확장 for구문.
		for(String val : sList) {
			System.out.println(val);
		}
	}

}
