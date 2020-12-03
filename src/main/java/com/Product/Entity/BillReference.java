package com.Product.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BILL_REF")
public class BillReference implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4119865373554936532L;

	@EmbeddedId
	private BillRefPK billRefPk;

	@Column(name = "QUANTITY")
	private Integer quantity;

	@Column(name = "TOTAL_PRICE")
	private Double totalPrice;

	public BillRefPK getBillRefPk() {
		return billRefPk;
	}

	public void setBillRefPk(BillRefPK billRefPk) {
		this.billRefPk = billRefPk;
	}

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
}
