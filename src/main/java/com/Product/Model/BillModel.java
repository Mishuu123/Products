package com.Product.Model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class BillModel extends BaseModel {

	@NotNull(message = "{customerId.is.required}")
	private Integer customerId;

	@NotNull(message = "{taxRate.is.required}")
	@Range(min = 1, max = 36, message = "{taxRate.not.exceed.36}")
	private Double taxRate;

	@NotNull(message = "{totalPrice.is.required}")
	private Double totalPrice;

	private Integer productId;

	@NotNull(message = "{quantity.is.required}")
	@Range(min = 1, max = 1000, message = "{quantity.not.exceed.1000}")
	private Integer quantity;
	
	private Date BillDate;
	
	public Date getBillDate() {
		return BillDate;
	}

	public void setBillDate(Date billDate) {
		BillDate = billDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
