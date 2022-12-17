package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "USERS", schema = "HR")
@Entity
public class Users {
	
	@Id
	@Column(name = "USER_ID")
	private String userID;
	
	@Column(name = "USER_ROLE")
	private String userRole;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	

}
