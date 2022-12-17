package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PRODUCT", schema ="HR")
@Entity
public class Product {
	@Id
	@Column(name = "PRODUCT_CODE")
	private String productCode;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "CATEGORY_ID")
	private String categoryID;
	
	@Column(name = "PRICE")
	private Integer price;
	
	@Column(name = "INSTRUCTOR_ID")
	private String instructorID;
	
	public String getproductCode() {
		return productCode;
	}
	
	public void setproductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getproductName() {
		return productName;
	}
	
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	public String getcategoryID() {
		return categoryID;
	}
	
	public void setcategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	public Integer getprice() {
		return price;
	}
	
	public void setprice(Integer price) {
		this.price = price;
	}
	
	public String getinstructorID() {
		return instructorID;
	}
	
	public void setinstructorID(String instructorID) {
		this.instructorID = instructorID;
	}

}
