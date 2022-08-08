package com.yedam.product;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	Scanner sc = new Scanner(System.in);

//상품 조회
	public void getProduct() {
		List<Product> list = ProductDAO.getInstance().getProduct();
		for (Product product : list) {
			System.out.println("========================");
			System.out.println("| 상품 명) " + product.getProductName() + "|");
			System.out.println("| 상품 가격) " + product.getProductPrice() + "|");

			System.out.println("========================");
		}
	}

	public void getDetailProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		for (Product product : list) {
			System.out.println("************************");
			System.out.println("* 상품 명) " + product.getProductName() + "*");
			System.out.println("* 상품 ID) " + product.getProductId() + "*");
			System.out.println("* 상품 가격) " + product.getProductPrice() + "*");
			System.out.println("* 상품 설명) " + product.getProductExplain() + "*");
			System.out.println("* 판매량) " + product.getProductSales() + "*");
			System.out.println("* 진열 점포) " + product.getStores() + "*");
			System.out.println("************************");
		}
	}

	public void getStoreProduct() {
		System.out.println("점포 입력> ");
		String stores = sc.nextLine();
		List<Product> list = ProductDAO.getInstance().getStoreProduct(stores);
		System.out.println(list.get(0).getStores() + " 지점입니다. ");
		// list 첫번째(0) 객체 중에서 점포 데이터 출력.

		for (int i = 0; i < list.size(); i++) {
			System.out.println("========================");
			System.out.println("* 상품 명) " + list.get(i).getProductName() + "*");
			System.out.println("* 상품 ID) " + list.get(i).getProductId() + "*");
			System.out.println("* 상품 가격) " + list.get(i).getProductPrice() + "*");
			System.out.println("* 상품 설명) " + list.get(i).getProductExplain() + "*");
			System.out.println("* 판매량) " + list.get(i).getProductSales() + "*");
			System.out.println("* 진열 점포) " + list.get(i).getStores() + "*");
			System.out.println("========================");
		}

	}

	public void insertProduct() {
		Product product = new Product();
		System.out.println("상품 명> ");
		String productName = sc.nextLine();

		System.out.println("상품 ID> ");
		String productId = sc.nextLine();

		System.out.println("상품 가격> ");
		int productPrice = Integer.parseInt(sc.nextLine());

		System.out.println("상품 설명> ");
		String productExplain = sc.nextLine();

		System.out.println("판매 량> ");
		int productSales = Integer.parseInt(sc.nextLine());

		System.out.println("진열점포> ");
		String Stores = sc.nextLine();

		product.setProductName(productName);
		product.setProductId(productId);
		product.setProductPrice(productPrice);
		product.setProductExplain(productExplain);
		product.setProductSales(productSales);
		product.setStores(Stores);

		int result = ProductDAO.getInstance().insertProduct(product);
		if (result == 1) {
			System.out.println("등록 성공");
		} else
			System.out.println("등록 실패");

	}

	public void deleteProduct() {
		System.out.println("삭제 상품ID>");
		String productId = sc.nextLine();

		int result = ProductDAO.getInstance().deleteProduct(productId);
		if (result == 1) {
			System.out.println("삭제 성공");
		} else
			System.out.println("삭제 실패");

	}

// 2-6) 상품 별 판매 갯수 출력 + 판매 금액
	// 모든 데이터 loading
	// 가져온 데이터를 자바에서 가공해서 출력
	public void calProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		int sum = 0;
		for (Product product : list) {// 하나씩 꺼내서 들어감.
			System.out.println("###########################");
			System.out.println("# 상품 명>" + product.getProductName() + "#");
			System.out.println("# 상품 판매갯수>" + product.getProductSales() + "#");
			System.out.println("# 상품 판매금액>" + (product.getProductPrice() * product.getProductSales()) + "#");
			System.out.println("###########################");
			sum += (product.getProductPrice()*product.getProductSales());
		}
		System.out.println("총 판매 금액> "+sum+"원 입니다.");
	}
}
