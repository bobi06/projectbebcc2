package com.example.projectbebcc2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.projectbebcc2.model.Users;
import com.example.projectbebcc2.repository.UsersRepository;
import com.example.projectbebcc2.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public List<Users> findAll() {
		return usersRepository.findAll();
	}
	
	@Override
	public String regUsers(Users req) {
		String result = "Failed to register Users Data!";
		if(req != null) {
			usersRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updUsers(Users req) {
		String result = "Failed to update Users Data!";
		
		Optional<Users> optUsers =
				usersRepository.findById(req.getUserID());
		
		if(optUsers.isPresent()) {
			usersRepository.save(req);
			result = "Success to update Users Data!";
		}
		return result;
		}
	
	@Override
	public String delUsers(String id) {
		String result = "Failed to delete Users Data!";
		
		Optional<Users> optUsers =
				usersRepository.findById(id);
		
		if(optUsers.isPresent()) {
			usersRepository.deleteById(id);
			result = "Success to delete Cart Data!";
		}
		
		return result;
		}

}





