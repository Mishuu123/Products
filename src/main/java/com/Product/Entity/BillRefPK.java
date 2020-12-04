package com.Product.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BillRefPK implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 5690057470551810720L;

	private Integer billId;

	@Column(name = "PRODUCT_ID")
	private Integer productId;

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
}
