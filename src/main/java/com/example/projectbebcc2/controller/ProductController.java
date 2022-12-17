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

import com.example.projectbebcc2.model.Product;
import com.example.projectbebcc2.service.ProductService;

@RestController
@RequestMapping("api/projectbebcc2/Product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping 
	public List<Product> findAll() {
		return productService.findAll();
	}
	
	@PostMapping
	public String regProduct(@RequestBody Product req) {
		return productService.regProduct(req);
	}
	
	@PutMapping
	public String updProduct(@RequestBody Product req) {
		return productService.updProduct(req);
	}
	
	@DeleteMapping("{productCode}")
	public String delProduct(@PathVariable String productCode) {
		return productService.delProduct(productCode);
	}

}
