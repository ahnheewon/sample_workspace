package Review1;

import java.util.Scanner;

import Review1.Product;

public class review2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.

		/*
		 * 1. Product Class -> 배열 -> 배열에 있는 데이터를 비교, 연산 -> 프로그램 2. Product -> 필드 price,
		 * amount, name
		 * 
		 * 3. Product[] proArr; 4. 각 인덱스 호출 최고 가격 제품 골라내기, 모든 제품 합 - 최고 가격 5. 코딩
		 */

		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 상품 수 = 배열의 사이즈이자 Product 객체 숫자
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Product[] pro = null;
		// List로 변환
		// List<Product> list = new ArrayList<>();

		boolean flag = true;

		while (flag) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("입력>");
			int menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
			case 1:
				System.out.println("상품 수 입력>");
				int count = Integer.parseInt(sc.nextLine());
				pro = new Product[count];
				break;
			case 2:
				for (int i = 0; i < pro.length; i++) {
					// pro[i]번째의 객체를 갖고 옴.
					// Product pro = new Product();

					// 기본 생성자만 있을 때
					pro[i] = new Product();

					System.out.println("상품 입력>");
					String name = sc.nextLine();
					pro[i].setName(name);

					System.out.println("상품 가격 입력>");
					int price = Integer.parseInt(sc.nextLine());
					pro[i].setPrice(price);

					System.out.println("상품 수량 입력>");
					int amount = Integer.parseInt(sc.nextLine());
					pro[i].setAmount(amount);

				}
				break;
			case 3:
				// 배열 타입으로 만들어진 변수
				// Product 객체

				for (Product product : pro) {
					System.out.println("상품명 : " + product.getName() + "상품 가격 : " + product.getPrice());
					product.getPrice();
				}
				break;
			case 4:
				// 최고 가격을 가진 상품
				// 최고 가격을 제외한 상품 가격의 합

				// 최고 가격을 비교하기 위한 변수
				int maxPro = 0;
				// 최고 가격을 가진 배열 인덱스
				// int idx = 0;
				// 총 합계를 구하기 위한 변수
				int sum = 0;
				for (int i = 0; i < pro.length; i++) {
					// 최고 가격 및 인덱스를 구하기 위함.
					if (pro[i].getPrice() > maxPro) {
						maxPro = pro[i].getPrice();
						// idx = i; // 최고 가격 위치
					}
					sum += pro[i].getPrice();
				}
				System.out.println("최고 가격을 뺀 상품 가격의 합 : " + (sum - maxPro));
				break;
			case 5:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			}

		}
	}
}
