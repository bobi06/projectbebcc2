package com.example.projectbebcc2.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectbebcc2.model.Instructor;
import com.example.projectbebcc2.repository.InstructorRepository;
import com.example.projectbebcc2.service.InstructorService;

@Service
public class InstructorServiceImpl implements InstructorService {
	
	@Autowired
	InstructorRepository instructorRepository;
	
	@Override
	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}
	
	@Override
	public String regInstructor(Instructor req) {
		String result = "Failed to register Instructor Data!";
		if(req != null) {
			instructorRepository.save(req);
			result = "Success";
			
			
		}
		return result;
	}
	
	@Override
	public String updInstructor(Instructor req) {
		String result = "Failed to update Instructor Data!";
		
		Optional<Instructor> optInstructor =
				instructorRepository.findById(req.getinstructorID());
		
		if(optInstructor.isPresent()) {
			instructorRepository.save(req);
			result = "Success to update Instructor Data!";
		}
		return result;
		}
	
	@Override
	public String delInstructor(String id) {
		String result = "Failed to delete Instructor Data!";
		
		Optional<Instructor> optInstructor =
				instructorRepository.findById(id);
		
		if(optInstructor.isPresent()) {
			instructorRepository.deleteById(id);
			result = "Success to delete Instructor Data!";
		}
		
		return result;
}

}
