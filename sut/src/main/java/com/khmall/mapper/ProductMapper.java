package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;


import com.khmall.dto.Product;






@Mapper
public interface ProductMapper {

	void insertProduct(Product product);
}




