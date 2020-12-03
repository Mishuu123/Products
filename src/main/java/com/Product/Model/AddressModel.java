package com.Product.Model;

import javax.validation.constraints.NotNull;

public class AddressModel extends BaseModel {

	@NotNull(message = "{address.is.required}")
	private String addressLOne;

	private String addressLTwo;

	private String city;

	@NotNull(message = "{state.is.required}")
	private String state;

	@NotNull(message = "ZipCode is required")
	private Integer zipCode;

	@NotNull(message = "{country.is.required}")
	private String country;

	public String getAddressLOne() {
		return addressLOne;
	}

	public void setAddressLOne(String addressLOne) {
		this.addressLOne = addressLOne;
	}

	public String getAddressLTwo() {
		return addressLTwo;
	}

	public void setAddressLTwo(String addressLTwo) {
		this.addressLTwo = addressLTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
