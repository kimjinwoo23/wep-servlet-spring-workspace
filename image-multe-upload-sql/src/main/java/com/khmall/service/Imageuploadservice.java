package com.khmall.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Imageuploadservice {

	public static void insertImageupload(String uploadDir,String fileName,MultipartFile multipartfile) throws IOException {
		
	Path uploadPath = Paths.get(uploadDir);
	
	if(!Files.exists(uploadPath)) {
		Files.createDirectories(uploadPath);
		
	}
		try(InputStream inputStream = multipartfile.getInputStream()){
		Path filePath = uploadPath.resolve(fileName);
		Files.copy(inputStream,filePath,StandardCopyOption.REPLACE_EXISTING)
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
	
	
	
	
	
	
}
