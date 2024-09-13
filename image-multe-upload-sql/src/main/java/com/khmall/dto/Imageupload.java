package com.khmall.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@NoArgsConstructor
@ToString 
@AllArgsConstructor

public class Imageupload {

	private int id;
	private String file_name;
	private String upload_dir;
	
	
}
