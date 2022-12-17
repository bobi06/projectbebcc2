package com.example.projectbebcc2.service;

import java.util.List;

import com.example.projectbebcc2.model.PaymentMethod;

public interface PaymentMethodService {
	
	public List<PaymentMethod> findAll();
	
	public String regPaymentMethod(PaymentMethod req);
	
	public String updPaymentMethod(PaymentMethod req);
	
	public String delPaymentMethod(String id);
	
}
