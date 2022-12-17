package com.example.projectbebcc2.service;

import java.util.List;

import com.example.projectbebcc2.model.PaymentHistory;


public interface PaymentHistoryService {
	public List<PaymentHistory> findAll();
	
	public String regPaymentHistory(PaymentHistory req);
	
	public String updPaymentHistory(PaymentHistory req);
	
	public String delPaymentHistory(String id);
	
}