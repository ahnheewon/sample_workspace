package co.edu.api;

import java.util.HashSet;

public class BoxingUnboxingEx {
//엄청 좋은 예제..
	public static void main(String[] args) {
		// 로또번호 생성. 1~45
		int[] lotto =new int[6];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j=0; j<i; i++) { //현재 값과 동일한 값이 있는 지 체크.
				//code HERE.
				
			}
		}
		
//		for(int num : lotto) {
//			
//			System.out.println(num); //중복되는 값이 나오면 안된다!!!
//		}

		HashSet<Integer> set= new HashSet<Integer>();
		
		int A = set.size(); // 1,2,3,3, => 3
		while(A<6) {
		int temp = (int)(Math.random()*45)+1;
		set.add(temp); // 중복된 값을 허용안함.
		A = set.size();
		System.out.println(temp+","+set.size());
			
		}


}}
