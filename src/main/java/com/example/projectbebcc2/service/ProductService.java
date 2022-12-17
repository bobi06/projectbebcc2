package com.example.projectbebcc2.service;

import java.util.List;

import com.example.projectbebcc2.model.Product;

public interface ProductService {
	public List<Product> findAll();
	
	public String regProduct(Product req);
	
	public String updProduct(Product req);
	
	public String delProduct(String id);
	
}
