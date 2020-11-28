package com.Product.entity;

import javax.persistence.Column;

public class BaseEntity {
	
	@Column(name = "VERSION")
	private Integer version;
	
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
