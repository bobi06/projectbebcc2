package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CART", schema ="HR")
@Entity
public class Cart {
	@Id
	@Column(name = "CART_ID")
	private String cartID;
	
	@Column(name = "CUSTOMER_ID")
	private String customerID;
	
	@Column(name = "PRODUCT_CODE")
	private String productCode;
	
	@Column(name = "PAYMENT_METHOD_ID")
	private String paymentMID;
	
	@Column(name = "CUSTOMER_EMAIL")
	private String customerEmail;
	
	
	public String getcartID() {
		return cartID;
	}
	
	public void setcartID(String cartID) {
		this.cartID = cartID;
	}
	
	public String getcustomerID() {
		return customerID;
	}
	
	public void setcustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String getproductCode() {
		return productCode;
	}
	
	public void setproductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getpaymentMID() {
		return paymentMID;
	}
	
	public void setpaymentMID(String paymentMID) {
		this.paymentMID = paymentMID;
	}
	
	public String getcustomerEmail() {
		return customerEmail;
	}
	
	public void setcustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
}
