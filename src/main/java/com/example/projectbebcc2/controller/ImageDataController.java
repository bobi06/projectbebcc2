package com.example.projectbebcc2.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.example.projectbebcc2.service.ImageDataService;


@RestController
@RequestMapping("api/projectbebcc2/ImageData")
public class ImageDataController {
	
	@Autowired
	ImageDataService imageDataService;
	
	@PostMapping()
	public String uploadImage(@RequestParam("imageD") MultipartFile file, String id) throws IOException {
		return imageDataService.uploadImage(file, id);
	}
	
	@PostMapping("{id}")
	public byte[] getImageDataById(@PathVariable String id) throws IOException {
		return imageDataService.getImageDataById(id);
	}
}
