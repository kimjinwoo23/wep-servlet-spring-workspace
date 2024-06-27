package com.khmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Product;
import com.khmall.mapper.ProductMapper;

@Service
public class ProductService {

public ProductMapper productmapper;
@Autowired
public void insertProduct(Product product) {
    
    product.getProduct_option();
    productmapper.insertProduct(product);
}

	
	
}
