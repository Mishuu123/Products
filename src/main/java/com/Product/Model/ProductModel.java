package com.Product.Model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class ProductModel extends BaseModel {

	@NotNull(message="{productName.is.required}")
	private String productName;
	
	private String company;
	
	@NotNull(message="{rate.is.required}")
	private Double rate;
	
	@NotNull(message="{totalPrice.is.required}")
	private Double totalPrice;

	@NotNull(message="{quantity.is.required}")
	@Range(min=1,max=1000,message="{quantity.not.exceed.1000}")
	private Integer quantity;

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

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
