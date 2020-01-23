package com.jacademy.robotics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacademy.robotics.entity.Products;
import com.jacademy.robotics.service.ProductService;

@RestController
public class AppController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/allProducts")
	public List<Products> GetAll(){
		return productService.allProducts();
	}
}
