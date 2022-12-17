package com.example.projectbebcc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectbebcc2.model.Category;
import com.example.projectbebcc2.service.CategoryService;




@RestController
@RequestMapping("api/projectbebcc2/Category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@GetMapping
	public List<Category> findAll() {
		return categoryService.findAll();

	}

	@PostMapping
	public String regCategory(@RequestBody Category req) {
		return categoryService.regCategory(req);
	}
	
	@PutMapping
	public String updCategory(@RequestBody Category req) {
		return categoryService.updCategory(req);
	}
	
	@DeleteMapping("{categoryID}")
	public String delCategory(@PathVariable String categoryID) {
		return categoryService.delCategory(categoryID);
	}
	
}

