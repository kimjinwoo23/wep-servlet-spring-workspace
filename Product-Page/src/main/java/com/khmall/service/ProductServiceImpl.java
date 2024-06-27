package com.khmall.service;

import com.khmall.dto.Product;
import com.khmall.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	  @Autowired
    private final ProductMapper productMapper;

   
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
  
    @Override
    public Product getProduct(String PRODUCT_NAME, String PRODUCT_IMAGE_PATH, int PRODUCT_PRICE, int PRODUCT_COUNT) {
        return productMapper.getProduct(PRODUCT_NAME, PRODUCT_IMAGE_PATH, PRODUCT_PRICE, PRODUCT_COUNT);
    }
}

