package com.Product.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Bill implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 5022023880699613995L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "BILL_ID")
	private Integer id;

	@OneToMany(mappedBy = "billRefPk.bill", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<BillReference> billRef;

	@Column(name = "CUSTOMER_ID")
	private Integer customerId;

	@Column(name = "TAX_RATE")
	private Double taxRate;

	@Column(name = "FINAL_PRICE")
	private Double finalPrice;

	@Column(name = "BILL_DATE")
	private Date billDate;

	@Column(name = "VERSION")
	@Version
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<BillReference> getBillRef() {
		return billRef;
	}

	public void setBillRef(List<BillReference> billRef) {
		this.billRef = billRef;
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

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
