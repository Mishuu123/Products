package com.Product.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "ADDRESS")
public class Address{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ADDRESS_ID")
	private Integer id;
	
	@Column(name = "VERSION")
	private Integer version;
	
	@Column(name = "ADD_ONE")
	private String addressLOne;

	@Column(name = "ADD_TWO")
	private String addressLTwo;
	
	@Column(name = "CITY")
	private String city;
	
	
	@Column(name = "STATE")
	private String state;
	
	
	@Column(name = "ZIP_CODE")
	private Integer zipCode;
	
	
	@Column(name = "COUNTRY")
	private String country;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	public String getAddressLOne() {
		return addressLOne;
	}

	public void setAddressLOne(String addressLOne) {
		this.addressLOne = addressLOne;
	}

	public String getAddressLTwo() {
		return addressLTwo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAddressLTwo(String addressLTwo) {
		this.addressLTwo = addressLTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
