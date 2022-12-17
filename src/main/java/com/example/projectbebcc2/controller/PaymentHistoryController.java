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


import com.example.projectbebcc2.model.PaymentHistory;

import com.example.projectbebcc2.service.PaymentHistoryService;


@RestController
@RequestMapping("api/projectbebcc2/PaymentHistory")
public class PaymentHistoryController {
	
	@Autowired
	PaymentHistoryService paymentHistoryService;
	
	@GetMapping 
	public List<PaymentHistory> findAll() {
		return paymentHistoryService.findAll();
	}
	
	@PostMapping
	public String regPaymentHistory(@RequestBody PaymentHistory req) {
		return paymentHistoryService.regPaymentHistory(req);
	}
	
	@PutMapping
	public String updPaymentHistory(@RequestBody PaymentHistory req) {
		return paymentHistoryService.updPaymentHistory(req);
	}
	
	@DeleteMapping("{paymentCD}")
	public String delPaymentHistory(@PathVariable String paymentCD) {
		return paymentHistoryService.delPaymentHistory(paymentCD);
	}

}
