package com.yedam.review;

import java.util.Scanner;

import Review1.Product;

public class LottoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lotto[] = new int[6];
		int money = 0;
		int chance = 0;
		int randomNum;

		boolean run = true;
		while (run) {
			System.out.println("\n메뉴를 선택해주세요.\n");
			System.out.println("1. 로또생성 | 2. 로또조회 | 99. 프로그램 종료 ");
			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				System.out.println("금액을 투입해주세요.");
				money = Integer.parseInt(sc.nextLine());
				chance = money / 1000;
				System.out.println("번호 출력 완료");
				// chance = money/1000;
				continue;
			}

			if (num == 2) {
				System.out.print("구매한 금액> " + money + "원\n");

				for (int i = 0; i < chance; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;

					if (i > 0 && i % 5 == 0)
						System.out.print("\n======================");
					System.out.print("\n" + (i + 1) + "번>");
					
					{if(i>0) 
					for (int j = 0; j < lotto.length; j++) {
						if(lotto[j] == lotto[i]) {
						i--;
						break;
						}else System.out.print(lotto[j]);
						}}
					
					

				}

				continue;
			}

			if (num == 99) {
				run = false;
				break;

			}
		}
	}
}
