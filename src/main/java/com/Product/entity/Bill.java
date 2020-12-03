package com.Product.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "BILL_ID")
	private Integer id;

	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "CUSTOMER_ID")
	private Integer customerId;

	@Column(name = "TAX_RATE")
	private Double taxRate;

	@Column(name = "QUANTITY")
	private Integer quantity;

	@Column(name = "TOTAL_PRICE")
	private Double totalPrice;

	@Column(name = "PRODUCT_ID")
	private Integer productId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
