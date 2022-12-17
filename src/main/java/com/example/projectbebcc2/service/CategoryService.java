package com.example.projectbebcc2.service;

import java.util.List;


import com.example.projectbebcc2.model.Category;


public interface CategoryService {
	public List<Category> findAll();
	
	public String regCategory(Category req);
	
	public String updCategory(Category req);
	
	public String delCategory(String id);

}


