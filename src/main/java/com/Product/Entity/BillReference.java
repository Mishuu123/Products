package com.Product.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "BILL_REF")
public class BillReference implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4119865373554936532L;

	@EmbeddedId
	private BillRefPK billRefPk;

	@MapsId("billId")
	@ManyToOne
	@JoinColumn(name = "BILL_ID")
	private Bill bill;

	@Column(name = "QUANTITY")
	private Integer quantity;

	@Column(name = "TOTAL_PRICE")
	private Double totalPrice;

	@Column(name = "VERSION")
	@Version
	private Integer version;

	public BillRefPK getBillRefPk() {
		return billRefPk;
	}

	public void setBillRefPk(BillRefPK billRefPk) {
		this.billRefPk = billRefPk;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
