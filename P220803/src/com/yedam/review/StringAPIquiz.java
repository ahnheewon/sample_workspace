package com.yedam.review;

import java.util.Scanner;

public class StringAPIquiz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("주민번호 앞자리를 입력하세요.");
		String front = s.nextLine();

		System.out.println("주민번호 뒷자리를 입력하세요.");
		String back = s.nextLine();

//	System.out.println("나이는"+(2022-Integer.parseInt(front.substring(2))));

		if (Integer.parseInt(front.substring(0, 2)) > 22 && Integer.parseInt(front.substring(0, 2)) < 100) {
			System.out.print("나이는 " + (122 - Integer.parseInt(front.substring(0, 2)))+",");
		} else
			System.out.print("나이는 " + (22 - Integer.parseInt(front.substring(0, 2)))+",");

		if (Integer.parseInt(back.substring(0,1)) == 1 || Integer.parseInt(back.substring(0,1)) == 3) {
			System.out.print(" 남자입니다.");
		} else if (Integer.parseInt(back.substring(0,1)) == 2 || Integer.parseInt(back.substring(0,1)) == 4) {
			System.out.print(" 여자입니다.");

		}
	}

}
