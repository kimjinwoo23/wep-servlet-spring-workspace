package com.khmall.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



import com.khmall.dto.Product;
import com.khmall.service.ProductService;

@Controller
public class ProductController {
	private ProductService productservice;

    @GetMapping("/")
    public String productPage() {
        return "product";
    }
    @PostMapping("/product")
    public String productinsert(Product product , Model model)  {
       
    	productservice.insertProduct(product);
    	
        return "product";
    }
}


