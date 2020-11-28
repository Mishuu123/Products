package com.Product.respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Product.entity.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	Customer save(Customer customer);

	public Optional<Customer> findById(Integer id);
	
	public Iterable<Customer> findAll();

}
