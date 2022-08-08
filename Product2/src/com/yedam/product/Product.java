package com.yedam.product;

public class Product {
/*
  	PRODUCT_ID	VARCHAR2(100 BYTE)
	PRODUCT_NAME	VARCHAR2(100 BYTE)
	PRODUCT_PRICE	NUMBER
	PRODUCT_EXPLAIN	VARCHAR2(4000 BYTE)
	PRODUCT_SALES	NUMBER
	STORES	VARCHAR2(100 BYTE)
	
 */

	private String  menuName;
	private int  menuPrice;
	private String menuExplain;
	private int  menuSales;
	
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	public String getMenuExplain() {
		return menuExplain;
	}
	public void setMenuExplain(String menuExplain) {
		this.menuExplain = menuExplain;
	}
	public int getMenuSales() {
		return menuSales;
	}
	public void setMenuSales(int menuSales) {
		this.menuSales = menuSales;
	}	

	

	
	
	
	
}
