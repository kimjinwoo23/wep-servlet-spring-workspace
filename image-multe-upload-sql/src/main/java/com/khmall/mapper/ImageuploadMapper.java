package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.Imageupload;

@Mapper
public interface ImageuploadMapper {

	void insertImageupload(Imageupload imageupload);
	
	
	
}
