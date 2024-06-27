package com.khmall.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

	
	private String PRODUCT_NAME;
	private String PRODUCT_IMAGE_PATH;
	private int PRODUCT_PRICE;
	private int PRODUCT_COUNT;
}
