package com.khmall.controller;

import com.khmall.dto.Product;
import com.khmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	 @Autowired
    private final ProductService productService;
   
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/")
    public Product getProduct(@RequestParam("PRODUCT_NAME") String PRODUCT_NAME,
                              @RequestParam("PRODUCT_IMAGE_PATH") String PRODUCT_IMAGE_PATH,
                              @RequestParam("PRODUCT_PRICE") int PRODUCT_PRICE,
                              @RequestParam("PRODUCT_COUNT") int PRODUCT_COUNT) {
        return productService.getProduct(PRODUCT_NAME, PRODUCT_IMAGE_PATH, PRODUCT_PRICE, PRODUCT_COUNT);
    }
}

