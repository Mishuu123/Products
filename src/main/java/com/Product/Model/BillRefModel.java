package com.Product.Model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class BillRefModel {

	@NotNull(message = "{totalPrice.is.required}")
	private Double totalPrice;

	private Integer productId;

	@NotNull(message = "{quantity.is.required}")
	@Range(min = 1, max = 1000, message = "{quantity.not.exceed.1000}")
	private Integer quantity;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
