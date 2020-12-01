package com.Product.Mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Customer;
import com.Product.Model.CustomerModel;

@Mapper(uses = AddressMapper.class)
public interface CustomerMapper {

	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	public abstract Customer customerModelTOEntity(CustomerModel model);

	public abstract CustomerModel entityToCustomerModel(Optional<Customer> response);

	public abstract CustomerModel entityToCustomerModel(Customer customer);

	public abstract List<CustomerModel> entityToCustomerModel(Iterable<Customer> response);
}
