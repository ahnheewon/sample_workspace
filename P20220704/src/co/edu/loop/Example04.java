package co.edu.loop;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1 ~ 100 임의의 수를 생성.

		Scanner sn = new Scanner(System.in);
    
		int temp = (int) (Math.random() * 100) + 1;
		System.out.println("임의의 숫자를 입력하세요");
		int num = sn.nextInt();

		boolean isTrue = true;
		while (isTrue) {
			if (num > temp) {
				System.out.println("랜덤숫자보다 값이 큽니다. \n다시 입력해주세요");
				num = sn.nextInt();

			} else if (num < temp) {
				System.out.println("랜덤숫자보다 값이 작습니다.\n다시 입력해주세요");
				num = sn.nextInt();
			}
				else if (num > 100) {
					System.out.println("랜덤숫자는 100보다 작습니다.");
					num = sn.nextInt();
			} else {
				System.out.println("랜덤숫자 '" + temp +"' (을)를 맞췄습니다. 축하합니다!");
				isTrue = false;
			}
		}
		System.out.println("end of prog.");

	}

}
