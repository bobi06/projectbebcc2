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

import com.example.projectbebcc2.model.Customer;
import com.example.projectbebcc2.service.CustomerService;


@RestController
@RequestMapping("api/projectbebcc2/Customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping 
	public List<Customer> findAll() {
		return customerService.findAll();
	}
	
	@PostMapping
	public String regCustomer(@RequestBody Customer req) {
		return customerService.regCustomer(req);
	}
	
	@PutMapping
	public String updCustomer(@RequestBody Customer req) {
		return customerService.updCustomer(req);
	}
	
	@DeleteMapping("{customerID}")
	public String delCustomer(@PathVariable String customerID) {
		return customerService.delCustomer(customerID);
	}

}