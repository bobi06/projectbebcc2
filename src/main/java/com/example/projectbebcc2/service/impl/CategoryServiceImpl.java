package com.example.projectbebcc2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectbebcc2.model.Category;
import com.example.projectbebcc2.repository.CategoryRepository;
import com.example.projectbebcc2.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		
		return categoryRepository.findAll();
	}
	
	@Override
	public String regCategory(Category req) {
		String result = "Failed to register Category Data!";
		if(req != null) {
			categoryRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updCategory(Category req) {
		String result = "Failed to update Category Data!";
		
		Optional<Category> optCategory =
				categoryRepository.findById(req.getcategoryID());
		
		if(optCategory.isPresent()) {
			categoryRepository.save(req);
			result = "Success to update Category Data!";
		}
		return result;
		}
		
		@Override
		public String delCategory(String id) {
			String result = "Failed to delete Category Data!";
			
			Optional<Category> optCategory =
					categoryRepository.findById(id);
			
			if(optCategory.isPresent()) {
				categoryRepository.deleteById(id);
				result = "Success to delete Category Data!";
			}
			
			return result;
	}
}

