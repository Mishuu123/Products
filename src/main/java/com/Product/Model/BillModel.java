package com.Product.Model;

import java.util.Date;
import java.util.List;

public class BillModel extends BaseModel {

	private Integer customerId;

	private List<BillRefModel> billRef;

	private Integer taxRate;

	private Double finalPrice;

	private Date billDate;

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public List<BillRefModel> getBillRef() {
		return billRef;
	}

	public void setBillRef(List<BillRefModel> billRef) {
		this.billRef = billRef;
	}

	public Integer getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Integer taxRate) {
		this.taxRate = taxRate;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
}
