package com.Product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Product;
import com.Product.Model.ProductModel;
import com.Product.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService prodService;

	@PostMapping
	@RequestMapping("/product/")
	public ResponseEntity<ProductModel> createProduct(@Valid @RequestBody ProductModel productRequest) {
		ProductModel prodResponse = prodService.addProduct(productRequest);
		return ResponseEntity.status(HttpStatus.OK).body(prodResponse);
	}

	@GetMapping
	@RequestMapping("/product/{id}")
	public ResponseEntity<ProductModel> getProduct(@PathVariable(value = "id") Integer id) {
		ProductModel prodResponse = prodService.getProduct(id);
		return ResponseEntity.status(HttpStatus.OK).body(prodResponse);

	}

	@GetMapping
	@RequestMapping("get/productAll/")
	public ResponseEntity<List<ProductModel>> getAllProduct() {
		List<ProductModel> prodResponse = prodService.getAllProducts();
		return ResponseEntity.status(HttpStatus.OK).body(prodResponse);

	}

	@DeleteMapping
	@RequestMapping("/deleteProd/{id}")
	public void deleteProduct(@Valid@PathVariable(value="id") Integer id){
		prodService.deleteProd(id);
		
	}
	
	@PutMapping("/updateProd/{id}")
	public ResponseEntity<ProductModel> updateStudent(@RequestBody ProductModel product, @PathVariable Integer id) {
		ProductModel prodResponse=prodService.updateProduct(product, id);
		return ResponseEntity.status(HttpStatus.OK).body(prodResponse);

		
	}
}