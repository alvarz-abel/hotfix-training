package com.alvarzabel.app.controllers;

import com.alvarzabel.app.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Arroz",10.00));
        products.add(new Product(2,"Frijol",8.00));
        products.add(new Product(3,"Maiz",5.00));
        products.add(new Product(4,"Naranjas",12.00));
        return ResponseEntity.ok(products);
    }
}
