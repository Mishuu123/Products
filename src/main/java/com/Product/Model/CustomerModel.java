package com.Product.Model;

import javax.validation.constraints.NotNull;

public class CustomerModel extends BaseModel {
	
	@NotNull(message="{customerName.is.required}")
	private String customerName;
	
	@NotNull(message="{billId.is.required}")
	private Integer billId;
	
	
	private AddressModel address;

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

}
