package com.jacademy.robotics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jacademy.robotics.entity.Products;
import com.jacademy.robotics.service.ProductService;

@Controller
public class WebController {
	@Autowired
	ProductService productService;

	@GetMapping("/home")
	public String goHome(Model model) {
		List<Products> products = productService.allProducts();
		model.addAttribute("products", products);
		return "index";
	}
	
	@GetMapping("/index")
	public String goIndex (Model model) {
		return "index";
	}
	
	@GetMapping("/services")
	public String goServices (Model model) {
		return "services";
	}
	
	@GetMapping("/about")
	public String goAbout (Model model) {
		return "about";
	}
	
	@GetMapping("/blog-home")
	public String goBlogHome (Model model) {
		return "blog-home";
	}
	
	@GetMapping("/blog-single")
	public String goBloSingle (Model model) {
		return "blog-single";
	}
	
	@GetMapping("/contact")
	public String goContact (Model model) {
		return "contact";
	}
	
	@GetMapping("/elements")
	public String goElements (Model model) {
		return "elements";
	}
	@GetMapping("/products")
	public String goProducts (Model model) {
		return "products";
	}
	
	@GetMapping("/product-details")
	public String goProductF (Model model) {
		return "product-details";
	}
	
	
	
	
	
	
}
