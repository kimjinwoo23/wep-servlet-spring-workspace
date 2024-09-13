package com.khmall.controller;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.mapper.ImageuploadMapper;

import ch.qos.logback.core.model.Model;

@Controller
public class ImageController {

	@Autowired
	private ImageuploadMapper imageuploadmapper;
	
	@PostMapping("/api/v1/img/upload")
	
	public String insertImageupload(@RequestParam("files")MultipartFile[] files,Model model) {
		Arrays.asList(files).forEach(file->{
			String fileName=String.cleanPath(Objects.requireNinNull(file.getOriginal))
		})
	}
	
	
	
	
}
