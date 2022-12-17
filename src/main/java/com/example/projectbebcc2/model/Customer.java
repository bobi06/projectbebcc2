package com.example.projectbebcc2.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CUSTOMER", schema ="HR")
@Entity
public class Customer {
	@Id
	@Column(name = "CUSTOMER_ID")
	private String customerID;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "CUSTOMER_JOB")
	private String customerJob;
	
	@Column(name = "CUSTOMER_ADDRESS")
	private String customerAddress;
	
	@Column(name = "CUSTOMER_EMAIL")
	private String customerEmail;
	
	public String getcustomerID() {
		return customerID;
	}
	
	public void setcustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getcustomerJob() {
		return customerJob;
	}
	
	public void setcustomerJob(String customerJob) {
		this.customerJob = customerJob;
	}
	
	public String getcustomerAddress() {
		return customerAddress;
	}
	
	public void setcustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public String getcustomerEmail() {
		return customerEmail;
	}
	
	public void setcustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
}