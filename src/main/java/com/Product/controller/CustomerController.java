package com.Product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Product.Model.CustomerModel;
import com.Product.Service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService custService;

	@PostMapping
	@RequestMapping("/customer/")
	public ResponseEntity<CustomerModel> createCustomer(@Valid @RequestBody CustomerModel customerRequest) {
		CustomerModel customerResponse = custService.addCustomer(customerRequest);
		return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
	}

	@GetMapping
	@RequestMapping("/customer/{id}")
	public ResponseEntity<CustomerModel> getCustomer(@PathVariable(value="id") Integer id) {
		CustomerModel customerResponse = custService.getCustomer(id);
		return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
		
	}	
		
		@GetMapping
		@RequestMapping("get/customerAll/")
		public ResponseEntity<List<CustomerModel>> getAllCustomer() {
			List<CustomerModel> customerResponse = custService.getAllCustomer();
			return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
		}
	
	}

