package com.example.projectbebcc2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectbebcc2.model.PaymentMethod;
import com.example.projectbebcc2.repository.PaymentMethodRepository;
import com.example.projectbebcc2.service.PaymentMethodService;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
	
	@Autowired
	PaymentMethodRepository paymentMethodRepository;
	
	@Override
	public List<PaymentMethod> findAll() {
		return paymentMethodRepository.findAll();
	}
	
	@Override
	public String regPaymentMethod (PaymentMethod req) {
		String result = "Failed to register Payment Method Data!";
		if(req != null) {
			paymentMethodRepository.save(req);
			result = "Success to register Payment Method Data!";
		}
		
		return result;
	}
	
	@Override
	public String updPaymentMethod(PaymentMethod req) {
		String result = "Failed to update Payment Method Data!";
		
		Optional<PaymentMethod> optPaymentMethod =
				paymentMethodRepository.findById(req.getPaymentMID());
		
		if(optPaymentMethod.isPresent()) {
			paymentMethodRepository.save(req);
			result = "Success to update Payment Method Data!";
		}
		return result;
		}
	
	@Override
	public String delPaymentMethod(String id) {
		String result = "Failed to delete Payment Method Data!";
		
		Optional<PaymentMethod> optPaymentMethod =
				paymentMethodRepository.findById(id);
		
		if(optPaymentMethod.isPresent()) {
			paymentMethodRepository.deleteById(id);
			result = "Success to delete Payment Method Data!";
		}
		
		return result;
		}
	
	}


