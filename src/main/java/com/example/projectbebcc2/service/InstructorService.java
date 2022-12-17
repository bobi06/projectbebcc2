package com.example.projectbebcc2.service;

import java.util.List;

import com.example.projectbebcc2.model.Instructor;


public interface InstructorService {
	public List<Instructor> findAll();
	
	public String regInstructor(Instructor req);
	
	public String updInstructor(Instructor req);
	
	public String delInstructor(String id);
	
}
