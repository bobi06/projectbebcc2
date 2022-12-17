package com.example.projectbebcc2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectbebcc2.model.Product;
import com.example.projectbebcc2.repository.ProductRepository;
import com.example.projectbebcc2.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	@Override
	public String regProduct(Product req) {
		String result = "Failed to register Product Data!";
		if(req != null) {
			productRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updProduct(Product req) {
		String result = "Failed to update Product Data!";
		
		Optional<Product> optProduct =
				productRepository.findById(req.getproductCode());
		
		if(optProduct.isPresent()) {
			productRepository.save(req);
			result = "Success to update Product Data!";
		}
		return result;
		}
	
	@Override
	public String delProduct(String id) {
		String result = "Failed to delete Product Data!";
		
		Optional<Product> optProduct =
				productRepository.findById(id);
		
		if(optProduct.isPresent()) {
			productRepository.deleteById(id);
			result = "Success to delete Product Data!";
		}
		
		return result;
}

}
