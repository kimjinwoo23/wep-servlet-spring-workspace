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

	private int Product_id;
	private String Product_name;
	private String Product_option;
	private int Product_price;
	private int Product_count;
}