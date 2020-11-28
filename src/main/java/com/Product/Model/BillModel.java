package com.Product.Model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class BillModel extends BaseModel {
	
	@NotNull(message="{customerId.is.required}")
	private Integer customerId;
	
	@NotNull(message="{taxRate.is.required}")
	@Range(min=1,max=36,message="{taxRate.not.exceed.36}")
	private Double taxRate;
	
	@NotNull(message="{totalPrice.is.required}")
	private Double totalPrice;

	private List<ProductModel> product;

	public List<ProductModel> getProduct() {
		return product;
	}

	public void setProduct(List<ProductModel> product) {
		this.product = product;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
