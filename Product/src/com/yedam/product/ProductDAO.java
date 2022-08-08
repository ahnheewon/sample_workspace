package com.yedam.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class ProductDAO extends DAO {

	private static ProductDAO productDao = null;

	private ProductDAO() {

	}

	public static ProductDAO getInstance() {
		return productDao == null ? productDao = new ProductDAO() : productDao;
		// 삼항연산자 , 참이면.. 거짓이면..
	}

	/*
	 * 메뉴(if, switch) 1) 상품 조회 - 상품 이름, 가격 2) 상품 상세 조회 - 상품 모든 내용 조회 3) 점포 별 상품 조회
	 * 4) 상품 등록 5) 상품 삭제 6) 상품 별 판매 갯수 출력 및 판매 금액 ★★
	 */

//2-1
	public List<Product> getProduct() {

		List<Product> list = new ArrayList<>();
		Product product = null;

		try {
			conn();
			String sql = "select product_name, product_price from product";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				list.add(product); // 리스트에 계속 추가 되면서 반환.
			}

		} catch (SQLException e) {
			// ora-00001 : 어떤 이유로 오류가 났습니다.
			System.out.println("※※※※ Error ※※※※");
			System.out.println("code : " + e.getErrorCode());
			System.out.println(e.getMessage()); // 이유
			e.getMessage();
			e.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

//2-2 상세 조회
	public List<Product> getDetailProduct() {

		List<Product> list = new ArrayList<>();
		Product product = null;

		try {
			conn();
			String sql = "select * from product";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductExplain(rs.getString("product_explain"));
				product.setProductId(rs.getString("product_id"));
				product.setProductSales(rs.getInt("product_sales"));
				product.setStores(rs.getString("stores"));
				list.add(product); // 리스트에 계속 추가 되면서 반환.
			}

		} catch (SQLException e) {
			// ora-00001 : 어떤 이유로 오류가 났습니다.
			System.out.println("※※※※ Error ※※※※");
			System.out.println("code : " + e.getErrorCode());
			System.out.println(e.getMessage()); // 이유
			e.getMessage();
			e.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

//2-3 점포 별 상품 조회
	public List<Product> getStoreProduct(String stores) {

		List<Product> list = new ArrayList<>();
		Product product = null;

		try {
			conn();
			String sql = "select * from product where stores = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stores);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductExplain(rs.getString("product_explain"));
				product.setProductId(rs.getString("product_id"));
				product.setProductSales(rs.getInt("product_sales"));
				product.setStores(rs.getString("stroes"));
				list.add(product); // 리스트에 계속 추가 되면서 반환.
			}

		} catch (SQLException e) {
			System.out.println("※※※※ Error ※※※※");
			System.out.println("code : " + e.getErrorCode());
			System.out.println(e.getMessage()); // 이유
			e.getMessage();
			e.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

//2-4 상품 등록
	public int insertProduct(Product product) {
		int result = 0;
		try {
			conn();
			String sql = "insert into product values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setInt(3, product.getProductPrice());
			pstmt.setString(4, product.getProductExplain());
			pstmt.setInt(5, product.getProductSales());
			pstmt.setString(6, product.getStores());

			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
// 상품 삭제
	public int deleteProduct(String productId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from product where product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productId);
			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

}
