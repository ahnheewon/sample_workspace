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
	private String productId;
	private String productName;
	private int productPrice;
	private String productExplain;
	private int productSales;	
	private String stores;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductExplain() {
		return productExplain;
	}
	public void setProductExplain(String productExplain) {
		this.productExplain = productExplain;
	}
	public int getProductSales() {
		return productSales;
	}
	public void setProductSales(int productSales) {
		this.productSales = productSales;
	}
	public String getStores() {
		return stores;
	}
	public void setStores(String stores) {
		this.stores = stores;
	}
	
	
	
	
}
