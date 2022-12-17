package com.example.projectbebcc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.PaymentMethod;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, String> {

}
