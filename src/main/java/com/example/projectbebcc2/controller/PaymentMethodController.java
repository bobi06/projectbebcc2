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

import com.example.projectbebcc2.model.PaymentMethod;
import com.example.projectbebcc2.service.PaymentMethodService;

@RestController
@RequestMapping("api/projectbebcc2/PaymentMethod")
public class PaymentMethodController {
	
	@Autowired
	PaymentMethodService paymentMethodService;
	
	@GetMapping 
	public List<PaymentMethod> findAll() {
		return paymentMethodService.findAll();
	}
	
	@PostMapping
	public String regPaymentMethod(@RequestBody PaymentMethod req) {
		return paymentMethodService.regPaymentMethod(req);
	}
	
	@PutMapping
	public String updPaymentMethod(@RequestBody PaymentMethod req) {
		return paymentMethodService.updPaymentMethod(req);
	}
	
	@DeleteMapping("{paymentMID}")
	public String delPaymentMethod(@PathVariable String paymentMID) {
		return paymentMethodService.delPaymentMethod(paymentMID);
	}

}



