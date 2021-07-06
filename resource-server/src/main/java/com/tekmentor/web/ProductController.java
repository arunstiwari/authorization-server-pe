package com.tekmentor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String[] getProducts() {
        return new String[]{"Product 1", "Product 2", "Product 3"};
    }
}