package com.yedam.product;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	Scanner sc = new Scanner(System.in);

//1.메뉴 조회
	public void getProduct() {
		List<Product> list = ProductDAO.getInstance().getProduct();
		for (Product product : list) {
			System.out.print(" 메뉴 : " + product.getMenuName());
			System.out.println("  가격 : " + product.getMenuPrice());

		}
	}

	//2. 메뉴 상세 조회
	public void getDetailProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		
		System.out.println("메뉴 입력> ");
		String menuName = sc.nextLine();	
	//	menu.setMenuName(menuName);
		
		for(Product menu : list) {
			System.out.println(" 메뉴 명: " +menu.getMenuName());
			System.out.println(" 메뉴 가격: " + menu.getMenuPrice());
			System.out.println(" 메뉴 설명: " + menu.getMenuExplain());
		}
		}
	

//3.메뉴 등록
	public void insertProduct() {
		Product product = new Product();
		System.out.println("메뉴 입력> ");
		String menuName = sc.nextLine();

		System.out.println("가격 입력> ");
		int menuPrice = Integer.parseInt(sc.nextLine());

		System.out.println("설명 입력> ");
		String menuExplain = sc.nextLine();

		product.setMenuName(menuName);
		product.setMenuPrice(menuPrice);
		product.setMenuExplain(menuExplain);


		int result = ProductDAO.getInstance().insertProduct(product);
		if (result == 1) {
			System.out.println("메뉴 등록 완료");
		} else
			System.out.println("등록 실패");

	}
	
	//3.판매 등록
		public void salesMenu() {
			Product menu = new Product();
			System.out.println("메뉴 입력> ");
			String menuName = sc.nextLine();

			menu.setMenuName(menuName);
			int sum =menu.getMenuSales();
			sum=sum+1;
			menu.setMenuSales(sum);
	
				System.out.println("판매량 완료");
	

		}
	
// 메뉴 삭제
	public void deleteProduct() {
		System.out.println("메뉴 입력>");
		String menuName = sc.nextLine();

		int result = ProductDAO.getInstance().deleteProduct(menuName);
		if (result == 1) {
			System.out.println("메뉴 삭제 완료");
		} else
			System.out.println("삭제 실패");

	}
	


// 2-6) 상품 별 판매 갯수 출력 + 판매 금액
	// 모든 데이터 loading
	// 가져온 데이터를 자바에서 가공해서 출력
	public void calProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct2();
		int sum = 0;
		for (Product product : list) {// 하나씩 꺼내서 들어감.
			System.out.print("메뉴 : " + product.getMenuName()  );
			System.out.print(", 판매 갯수 :" + product.getMenuSales()+" 개");
			System.out.println(", 판매 금액 :" + (product.getMenuPrice() * product.getMenuSales()) );
			sum += (product.getMenuPrice()*product.getMenuSales());
		}
		System.out.println("총 판매 금액> "+sum+"원 입니다.");
	}
}
