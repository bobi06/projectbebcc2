package com.example.projectbebcc2.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PAYMENT_HISTORY", schema ="HR")
@Entity
public class PaymentHistory {
	@Id
	@Column(name = "PAYMENT_CODE")
	private String paymentCD;
	
	@Column(name = "CART_ID")
	private String cartID;
	
	@Column(name = "PAYMENT_METHOD_ID")
	private String paymentMID;
	
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;
	
	@Column(name = "STATUS")
	private String status;
	
	
	public String getpaymentCD() {
		return paymentCD;
	}
	
	public void setpaymentCD(String paymentCD) {
		this.paymentCD = paymentCD;
	}
	
	public String getcartID() {
		return cartID;
	}
	
	public void setcartID(String cartID) {
		this.cartID = cartID;
	}
	
	public String getpaymentMID() {
		return paymentMID;
	}
	
	public void setpaymentMID(String paymentMID) {
		this.paymentMID = paymentMID;
	}
	
	public Date getpaymentDate() {
		return paymentDate;
	}
	
	public void setpaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public String getstatus() {
		return status;
	}
	
	public void setstatus(String status) {
		this.status = status;
	}
	
}