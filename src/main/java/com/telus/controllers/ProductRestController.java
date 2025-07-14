package com.telus.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductRestController {
	
	@GetMapping("/info")
	public ResponseEntity<String> getProductInfo(){
		return ResponseEntity.ok("Redmi 12 5g");
	}
	

}
