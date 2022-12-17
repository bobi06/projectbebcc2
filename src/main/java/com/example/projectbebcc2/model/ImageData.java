package com.example.projectbebcc2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "IMAGE_DATA", schema = "HR")
@Entity
public class ImageData {
	@Id
	@Column(name ="ID")
	private String id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "TIPE")
	private String tipe;
	
	@Column(name ="IMAGE_D", length = 1000)
	private byte[] imageD;



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTipe() {
		return tipe;
	}



	public void setTipe(String tipe) {
		this.tipe = tipe;
	}



	public byte[] getImageD() {
		return imageD;
	}



	public void setImageD(byte[] imageD) {
		this.imageD = imageD;
	}
	
}
