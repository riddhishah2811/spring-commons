package com.weshopify.commons;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderNumber;
	private List<Product> productsOrdered;
	private int CustomerId;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public List<Product> getProductsOrdered() {
		return productsOrdered;
	}
	public void setProductsOrdered(List<Product> productsOrdered) {
		this.productsOrdered = productsOrdered;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	
	
	

}
