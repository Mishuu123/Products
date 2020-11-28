package com.Product.Model;

import javax.validation.constraints.NotNull;

public class UserModelResponse {

	@NotNull(message="{email.is.required}")
	private String email;
	
	@NotNull(message="{userName.is.required}")
	private String name;

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
