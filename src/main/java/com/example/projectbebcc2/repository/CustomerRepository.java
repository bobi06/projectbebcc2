package com.example.projectbebcc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
