package com.jacademy.robotics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacademy.robotics.entity.Products;
import com.jacademy.robotics.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;
	
	@Autowired
	public ProductService (ProductRepository productRepository) {
		 this.productRepository =  productRepository;
	}
	
	public List<Products>allProducts(){
		return (List<Products>)productRepository.findAll();
	}
}
