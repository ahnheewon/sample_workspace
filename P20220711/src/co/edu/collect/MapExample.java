package co.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample {

	/*
	 * 이름, 점수 => map저장.
	 *
	 * 김민수, 80/ 황현익, 75/ 이현승, 88 Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환.
	 * 
	 * map 타입 안쓰는 방법도 해보기.
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();

		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);

		// 출력결과:
		// 평균점수:81
		// 최고점수:88, 최고점수 학생의 이름: 이현승.

		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		int sum = 0;
		int max = 0;
		String first ="";
		double avg=0;
		
		for (int i = 0; i < map.size(); i++) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			sum += value;
			
			if (max < value) {
				max = value;
			   first =key;
			}
		}
		avg= sum/map.size();
		System.out.println("평균점수 : "+ avg +"  최고점수 : "+ max+",\n최고점수 학생의 이름은..  "+first);

//		//학생이름으로 검색.
//		System.out.println("이름을 입력하세요.");
//		String name = scn.nextLine();
//
//		int score = map.get(name); // 값을 얻으려고 하면 키를 get() 사용.
//		System.out.println(score); // 이름 입력시 점수 출력하는 것, 내가 한 풀이.

		System.out.println("==========================");

//		Set<Entry<String, Integer>> set = map.entrySet();
//
//		for (Entry<String, Integer> ent : set) {
//			if (ent.getKey().equals(name)) {
//				System.out.println("학생의 점수: " + ent.getValue()); //이름 입력시 점수 출력하는 것, 교수님 풀이.
//			}
	}

}
