package com.Product.Helper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Product.Entity.Address;
import com.Product.Entity.Bill;
import com.Product.Entity.Customer;
import com.Product.Entity.Product;

@Component
public class ProductHelper {

	public void billAssociation(Bill bill)
	{
		List<Product> products =bill.getProduct();
        products.forEach(p->p.setBill(bill));
	}
	 
	public void customerAssociation(Customer customer)
	{
		Address address=customer.getAddress();
		address.setCustomer(customer);
	}
}
