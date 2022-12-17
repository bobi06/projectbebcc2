package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "INSTRUCTOR", schema ="HR")
@Entity
public class Instructor {
	@Id
	@Column(name = "INSTRUCTOR_ID")
	private String instructorID;
	
	@Column(name = "INSTRUCTOR_NAME")
	private String instructorName;
	
	@Column(name = "INSTRUCTOR_JOB")
	private String instructorJob;
	
	public String getinstructorID() {
		return instructorID;
	}
	
	public void setinstructorID(String instructorID) {
		this.instructorID = instructorID;
	}
	
	public String getinstructorName() {
		return instructorName;
	}
	
	public void setinstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public String getinstructorJob() {
		return instructorJob;
	}
	
	public void setinstructorJob(String instructorJob) {
		this.instructorJob = instructorJob;
	}

}
