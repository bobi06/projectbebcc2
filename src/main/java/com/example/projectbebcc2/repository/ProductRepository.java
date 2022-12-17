package com.example.projectbebcc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
