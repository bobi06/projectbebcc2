package com.example.projectbebcc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.projectbebcc2.model.Users;
import com.example.projectbebcc2.service.UsersService;

@RestController
@RequestMapping("api/projectbebcc2/Users")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping 
	public List<Users> findAll() {
		return usersService.findAll();
	}
	
	@PostMapping
	public String regUsers(@RequestBody Users req) {
		return usersService.regUsers(req);
	}
	
	@PutMapping
	public String updUsers(@RequestBody Users req) {
		return usersService.updUsers(req);
	}
	
	@DeleteMapping("{userID}")
	public String delUsers(@PathVariable String userID) {
		return usersService.delUsers(userID);
	}

}
