package com.manthan.shoppingapp.bean;

public class ProductBean {
	private String productName;
	private int productId;
	private double prodcost;
	public double getProdcost() {
		return prodcost;
	}
	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}
	private String prodColor;
	private String description;
	private int quantity;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
