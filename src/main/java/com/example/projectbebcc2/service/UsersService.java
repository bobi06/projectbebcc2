package com.example.projectbebcc2.service;

import java.util.List;


import com.example.projectbebcc2.model.Users;

public interface UsersService {
	
public List<Users> findAll();
	
	public String regUsers(Users req);
	
	public String updUsers(Users req);
	
	public String delUsers(String id);

}
