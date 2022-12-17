package com.example.projectbebcc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {

}
