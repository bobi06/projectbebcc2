package com.example.projectbebcc2.service;

import java.util.List;

import com.example.projectbebcc2.model.Customer;


public interface CustomerService {
	
	public List<Customer> findAll();
		
	public String regCustomer(Customer req);
		
	public String updCustomer(Customer req);
		
	public String delCustomer(String id);
		
	
}
