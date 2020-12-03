package com.Product.Helper;

import org.springframework.stereotype.Component;

import com.Product.Entity.Address;
import com.Product.Entity.Customer;

@Component
public class ProductHelper {

	public void customerAssociation(Customer customer) {
		Address address = customer.getAddress();
		address.setCustomer(customer);
	}
}
