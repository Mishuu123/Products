package com.Product.Model;

import javax.validation.constraints.NotNull;

public class ProductModel extends BaseModel {

	@NotNull(message = "{productName.is.required}")
	private String productName;

	private String company;

	@NotNull(message = "{rate.is.required}")
	private Double rate;

	private Boolean isAvailable;
	
	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
