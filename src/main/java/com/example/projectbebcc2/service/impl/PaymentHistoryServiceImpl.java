package com.example.projectbebcc2.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.projectbebcc2.model.PaymentHistory;
import com.example.projectbebcc2.repository.PaymentHistoryRepository;
import com.example.projectbebcc2.service.PaymentHistoryService;


@Service
public class PaymentHistoryServiceImpl implements PaymentHistoryService {
	
	@Autowired
	PaymentHistoryRepository paymentHistoryRepository;
	
	@Override
	public List<PaymentHistory> findAll() {
		return paymentHistoryRepository.findAll();
	}
	
	@Override
	public String regPaymentHistory(PaymentHistory req) {
		String result = "Failed to register Payment History Data!";
		if(req != null) {
			paymentHistoryRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updPaymentHistory(PaymentHistory req) {
		String result = "Failed to update Payment History Data!";
		
		Optional<PaymentHistory> optPaymentHistory =
				paymentHistoryRepository.findById(req.getpaymentCD());
		
		if(optPaymentHistory.isPresent()) {
			paymentHistoryRepository.save(req);
			result = "Success to update Payment History Data!";
		}
		return result;
		}
	
	@Override
	public String delPaymentHistory(String id) {
		String result = "Failed to delete Payment History Data!";
		
		Optional<PaymentHistory> optPaymentHistory =
				paymentHistoryRepository.findById(id);
		
		if(optPaymentHistory.isPresent()) {
			paymentHistoryRepository.deleteById(id);
			result = "Success to delete Payment History Data!";
		}
		
		return result;
		}

}