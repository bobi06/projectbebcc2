package com.example.projectbebcc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.PaymentHistory;


public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, String> {

}