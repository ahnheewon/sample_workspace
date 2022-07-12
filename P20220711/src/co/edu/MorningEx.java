package co.edu;

import java.util.Scanner;

public class MorningEx {

	public static void main(String[] args) {
		String[] fruits = { "딸기", "바나나", "오렌지", "파인애플" };
		Scanner scn = new Scanner(System.in);
		boolean isExist = false;
		System.out.println("과일을 입력하세요");

		String choice = scn.nextLine();
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(choice)) {
				System.out.println("해당 값의 위치는 fruits 배열 " + (i + 1) + "번째 위치 입니다.");

				isExist = true; // 값이 있었다.
				break;
			}

		}

		if (!isExist) //값이 없으면..
			System.out.println("찾는 값이 없습니다.");

	}

}
