package com.example.projectbebcc2.service.impl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.projectbebcc2.model.ImageData;
import com.example.projectbebcc2.repository.ImageDataRepository;
import com.example.projectbebcc2.service.ImageDataService;
import com.example.projectbebcc2.util.ImageDataUtil;


@Service
public class ImageDataServiceImpl implements ImageDataService{
	

	@Autowired
	ImageDataRepository imageDataRepository;
	
	@Autowired
	ImageDataUtil imageDataUtil;
	
	
	@Override
	public String uploadImage(MultipartFile file, String id) throws IOException {
		String result = "Failed to Upload Image!";
		byte[] imageByte = ImageDataUtil.compressImage(file.getBytes());
		
		Optional<ImageData> isImageDataExt = imageDataRepository.findById(id);
		
		if (isImageDataExt != null) {
			ImageData img = isImageDataExt.get();
			img.setImageD(imageByte);
			
			imageDataRepository.save(img);
			result = "Success to upload image!";
		}
		
		return result;
	}
	
	@Override
	public byte[] getImageDataById(String id) {
		byte[] result = null;
		Optional<ImageData> isImageDataExt = imageDataRepository.findById(id);
		
		if(isImageDataExt != null) {
			ImageData img = isImageDataExt.get();
			result = ImageDataUtil.decompressImage(img.getImageD());
		}
		
		return result;
	}

	
}
