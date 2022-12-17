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

import com.example.projectbebcc2.model.Instructor;
import com.example.projectbebcc2.service.InstructorService;

@RestController
@RequestMapping("api/projectbebcc2/Instructor")
public class InstructorController {
	
	@Autowired
	InstructorService instructorService;
	
	@GetMapping
	public List<Instructor> findAll() {
		return instructorService.findAll();
	}
	
	@PostMapping
	public String regInstructor(@RequestBody Instructor req) {
		return instructorService.regInstructor(req);
	}
	
	@PutMapping
	public String updInstructor(@RequestBody Instructor req) {
		return instructorService.updInstructor(req);
	}
	
	@DeleteMapping("{instructorID}")
	public String delInstructor(@PathVariable String instructorID) {
		return instructorService.delInstructor(instructorID);
	}
}