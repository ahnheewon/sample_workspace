package co.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean isTrue = true;
		int sum = 0;
		// sum의 누적값이 100을 초과할 때 반복문 종료되게 하는 do-while 구문
		do {
			System.out.println("숫자를 입력하세요. 현재 누적된 수: " + sum);
			int num = scn.nextInt();
			sum += num;
			if (sum > 100) {
				isTrue = false;
				System.out.println("100이 초과하여 계산을 종료합니다 \nsum의 누적값: " + sum);
				System.out.println("\n※ 100을 초과하기 전의 숫자: " + (sum-num));
			} // 또는 breaks; 적어도 됨.
		} while (isTrue);
		

		System.out.println("end of prog.");
	}
}
