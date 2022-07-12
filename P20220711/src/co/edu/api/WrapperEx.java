package co.edu.api;

import java.util.ArrayList;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);

		int i2 = 100;

		ArrayList<Integer> list = new ArrayList<>();
		list.add(100); // 100(int) => 100(Interger) 박싱.
		list.add(200);
		list.add(new Integer(300)); // deprecated 된 것 차후 사용중지.

		for (Integer num : list) { // list 안에 담고있는 만큼 반복하겠습니다 라는 뜻.
			System.out.println(num);

		}

		// 문자열 => 숫자.
		int n1 = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.3");

	}

}
