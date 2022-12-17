package com.example.projectbebcc2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectbebcc2.model.Cart;
import com.example.projectbebcc2.repository.CartRepository;
import com.example.projectbebcc2.service.CartService;


@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public List<Cart> findAll() {
		return cartRepository.findAll();
	}
	
	@Override
	public String regCart(Cart req) {
		String result = "Failed to register Cart Data!";
		if(req != null) {
			cartRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updCart(Cart req) {
		String result = "Failed to update Cart Data!";
		
		Optional<Cart> optCart =
				cartRepository.findById(req.getcartID());
		
		if(optCart.isPresent()) {
			cartRepository.save(req);
			result = "Success to update Cart Data!";
		}
		return result;
		}
	
	@Override
	public String delCart(String id) {
		String result = "Failed to delete Cart Data!";
		
		Optional<Cart> optCart =
				cartRepository.findById(id);
		
		if(optCart.isPresent()) {
			cartRepository.deleteById(id);
			result = "Success to delete Cart Data!";
		}
		
		return result;
		}

}




