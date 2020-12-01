package com.Product.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Product.Model.UserModel;
import com.Product.Model.UserModelResponse;
import com.Product.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	@RequestMapping("/user/")
	public ResponseEntity<UserModel> createUser(@Valid @RequestBody UserModel userRequest) {
		UserModel userResponse = userService.addUser(userRequest);
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);
	}

	@GetMapping
	@RequestMapping("/user/{email}")
	public ResponseEntity<UserModelResponse> getUser(@PathVariable(value = "email") String email) {
		UserModelResponse userResponse = userService.getUser(email);
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);

	}

	@DeleteMapping
	@RequestMapping("/deleteUser/{id}")
	public void deleteUser(@Valid@PathVariable(value="id") Integer id){
		userService.deleteUser(id);
		
	}
}
