package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CATEGORY", schema ="HR")
@Entity
public class Category {
	@Id
	@Column(name = "CATEGORY_ID")
	private String categoryID;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	
	public String getcategoryID() {
		return categoryID;
			
	}

	public void setcategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getcategoryName() {
		return categoryName;
	}

	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}