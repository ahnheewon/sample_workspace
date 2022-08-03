package assignment;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.

		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료

		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.

		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"

		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.

		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		boolean run = true;
		int mcNum = 0;
		String[] mcName = null; // 상품 이름
		int[] mcPrice = null; // 상품 가격
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println(" 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.println("상품 수를 입력하세요.");
				mcNum = scn.nextInt();
				if (mcNum > 0) {
					mcName = new String[mcNum];
					mcPrice = new int[mcNum];
					System.out.println("상품 수 등록이 완료됐습니다.");
					continue;
				} else {
					System.out.println("잘못 입력하였습니다.");
				}

			} else if (selectNo == 2) {

				if (mcPrice == null) {
					System.out.println("상품 수를 먼저 입력해주세요.");
					continue;
				}

				System.out.println("상품 이름을 등록해주세요");
				int price;
				String name;

				for (int i = 0; i < mcPrice.length; i++) {

					System.out.println((i + 1) + "번 상품의 이름: ");
					name = scn.nextLine();
					if (name != null) {
						name = scn.nextLine();
					}
					mcName[i] = name;

					System.out.println((i + 1) + "번 상품의 가격: ");
					price = scn.nextInt();
					if (price > 0) {
						mcPrice[i] = price;
					}

					else {
						System.out.println("잘못 입력하였습니다.");
						i--;

					}

				}

			} else if (selectNo == 3) {
				if (mcName == null) {
					System.out.println("상품 수를 먼저 입력해주세요.");
					continue;
				}
				System.out.println("제품 별 가격 입니다.");
				for (int i = 0; i < mcName.length; i++) {
					System.out.printf("%d번 상품명: %s , 가격: %d 원 \n", (i + 1), mcName[i], mcPrice[i]);
				}

			} else if (selectNo == 4) {
				if (mcName == null) {
					System.out.println("상품 수를 먼저 입력해주세요.");
					continue;
				}

				int max = 0;
				String maxName = "";
				int sum = 0;
				double avg = 0;

				for (int i = 0; i < mcPrice.length; i++) {
					if (max < mcPrice[i])
						max = mcPrice[i];
					maxName = mcName[i];
					sum += mcPrice[i];
				}

				System.out.printf("최고 가격 상품은 %s이고, %d원 입니다.\n해당 제품을 제외한 제품 가격의 총 합은 %d원 입니다.\n", maxName, max,
						sum - max);

			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료하겠습니다.");
				run = false;
				break;
			}
		}

	}

}
