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

import com.example.projectbebcc2.model.Cart;
import com.example.projectbebcc2.service.CartService;


@RestController
@RequestMapping("api/projectbebcc2/Cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@GetMapping 
	public List<Cart> findAll() {
		return cartService.findAll();
	}
	
	@PostMapping
	public String regCart(@RequestBody Cart req) {
		return cartService.regCart(req);
	}
	
	@PutMapping
	public String updCart(@RequestBody Cart req) {
		return cartService.updCart(req);
	}
	
	@DeleteMapping("{cartID}")
	public String delCart(@PathVariable String cartID) {
		return cartService.delCart(cartID);
	}

}
