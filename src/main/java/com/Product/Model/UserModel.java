package com.Product.Model;

import javax.validation.constraints.NotNull;

public class UserModel {

	
	private Integer id;

	@NotNull(message="{password.is.required}")
	private String password;

	@NotNull(message="{email.is.required}")
	private String email;

	@NotNull(message="{userName.is.required}")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
