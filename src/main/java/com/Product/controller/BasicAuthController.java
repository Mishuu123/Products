package com.Product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Product.exception.AuthenticationBean;

@RestController
	@RequestMapping("/api/v1")
	public class BasicAuthController {

	    @GetMapping(path = "/basicauth")
	    public AuthenticationBean basicauth() {
	        return new AuthenticationBean("You are authenticated");
	    }
}
