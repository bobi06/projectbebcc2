package com.example.projectbebcc2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.ImageData;

public interface ImageDataRepository extends JpaRepository<ImageData, String> {
	
	Optional<ImageData> findById(String id);

}
