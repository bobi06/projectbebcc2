package com.example.projectbebcc2.service;

import java.util.List;

import com.example.projectbebcc2.model.Cart;


public interface CartService {
	public List<Cart> findAll();
	
	public String regCart(Cart req);
	
	public String updCart(Cart req);
	
	public String delCart(String id);
	
}