package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PAYMENT_METHOD", schema = "HR")
@Entity
public class PaymentMethod {
	
	@Id
	@Column(name = "PAYMENT_METHOD_ID")
	private String paymentMID;
	
	@Column(name = "PAYMENT_METHOD_NAME")
	private String paymentMN;

	
	public String getPaymentMID() {
		return paymentMID;
	}

	public void setPaymentMID(String paymentMID) {
		this.paymentMID = paymentMID;
	}

	public String getPaymentMN() {
		return paymentMN;
	}

	public void setPaymentMN(String paymentMN) {
		this.paymentMN = paymentMN;
	}
	

}
