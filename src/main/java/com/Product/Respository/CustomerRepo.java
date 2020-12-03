package com.Product.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
