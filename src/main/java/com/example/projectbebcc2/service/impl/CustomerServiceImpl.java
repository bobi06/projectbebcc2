package com.example.projectbebcc2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectbebcc2.model.Customer;
import com.example.projectbebcc2.repository.CustomerRepository;
import com.example.projectbebcc2.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	@Override
	public String regCustomer(Customer req) {
		String result = "Failed to register Customer Data!";
		if(req != null) {
			customerRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updCustomer(Customer req) {
		String result = "Failed to update Customer Data!";
		
		Optional<Customer> optCustomer =
				customerRepository.findById(req.getcustomerID());
		
		if(optCustomer.isPresent()) {
			customerRepository.save(req);
			result = "Success to update Customer Data!";
		}
		return result;
		}
	
	@Override
	public String delCustomer(String id) {
		String result = "Failed to delete Customer Data!";
		
		Optional<Customer> optCustomer =
				customerRepository.findById(id);
		
		if(optCustomer.isPresent()) {
			customerRepository.deleteById(id);
			result = "Success to delete Customer Data!";
		}
		
		return result;
}

}
