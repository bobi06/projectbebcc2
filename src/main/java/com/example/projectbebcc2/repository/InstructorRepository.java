package com.example.projectbebcc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbebcc2.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, String> {

}
