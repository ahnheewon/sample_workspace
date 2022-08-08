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


//2-1
	public List<Product> getProduct() {

		List<Product> list = new ArrayList<>();
		Product Menu = null;

		try {
			conn();
			String sql = "select Menu_name, Menu_price from cafe";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Menu = new Product();
				Menu.setMenuName(rs.getString("menu_name"));
				Menu.setMenuPrice(rs.getInt("menu_price"));
				list.add(Menu); // 리스트에 계속 추가 되면서 반환.
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
		Product menu = null;

		try {
			conn();
			String sql = "select * from cafe";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				menu = new Product();
				menu.setMenuName(rs.getString("Menu_name"));
				menu.setMenuPrice(rs.getInt("Menu_price"));
				menu.setMenuExplain(rs.getString("Menu_explain"));
				menu.setMenuSales(rs.getInt("Menu_sales"));
				list.add(menu); // 리스트에 계속 추가 되면서 반환.
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
	//
	public List<Product> getDetailProduct2() {

		List<Product> list = new ArrayList<>();
		Product menu = null;

		try {
			conn();
			String sql = "select * from cafe";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				menu = new Product();
				menu.setMenuName(rs.getString("Menu_name"));
				menu.setMenuPrice(rs.getInt("Menu_price"));
				menu.setMenuExplain(rs.getString("Menu_explain"));
				menu.setMenuSales(rs.getInt("Menu_sales"));
				list.add(menu); // 리스트에 계속 추가 되면서 반환.
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
//	public List<Product> getStoreProduct(String stores) {
//
//		List<Product> list = new ArrayList<>();
//		Product Menu = null;
//
//		try {
//			conn();
//			String sql = "select * from Menu where stores = ?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, stores);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				Menu = new Product();
//				Menu.setMenuName(rs.getString("Menu_name"));
//				Menu.setMenuPrice(rs.getInt("Menu_price"));
//				Menu.setMenuExplain(rs.getString("Menu_explain"));
//				Menu.setMenuSales(rs.getInt("Menu_sales"));
//				list.add(Menu); // 리스트에 계속 추가 되면서 반환.
//			}
//
//		} catch (SQLException e) {
//			System.out.println("※※※※ Error ※※※※");
//			System.out.println("code : " + e.getErrorCode());
//			System.out.println(e.getMessage()); // 이유
//			e.getMessage();
//			e.getErrorCode();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//
//		return list;
//	}

//2-4 상품 등록
	public int insertProduct(Product product) {
		int result = 0;
		try {
			conn();
			String sql = "insert into cafe values (?,?,'',?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getMenuName());
			pstmt.setInt(2, product.getMenuPrice());
			pstmt.setString(3, product.getMenuExplain());

			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
// 상품 삭제
	public int deleteProduct(String menuName) {
		int result = 0;
		Product menu = null;
		try {
			conn();
			String sql = "delete from cafe where Menu_name = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1,menuName);
			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
		

	}

}
