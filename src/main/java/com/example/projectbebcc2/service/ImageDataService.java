package com.example.projectbebcc2.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.projectbebcc2.model.ImageData;

public interface ImageDataService {
	
	public List<ImageData> findAll();
	
	public String regImageData(ImageData req);
	
	public String updImageData(ImageData req);
	
	public String delImageData(String id);
	
	public byte[] getImageDataById(String id);

	public String uploadImage(MultipartFile file, String id) throws IOException;


}
