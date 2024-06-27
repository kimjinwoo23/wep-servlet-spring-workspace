package com.khmall.service;

import com.khmall.dto.Product;

public interface ProductService {
    Product getProduct(String PRODUCT_NAME, String PRODUCT_IMAGE_PATH, int PRODUCT_PRICE, int PRODUCT_COUNT);
}
