package com.Product.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class BillRefPK implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 5690057470551810720L;

	@ManyToOne
	@JoinColumn(name = "BILL_ID")
	private Bill bill;

	@Column(name = "PRODUCT_ID")
	private Integer productId;

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
}
