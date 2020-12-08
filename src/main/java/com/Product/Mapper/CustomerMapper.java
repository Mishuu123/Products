package com.Product.Mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Customer;
import com.Product.Model.CustomerModel;

@Mapper(uses = AddressMapper.class)
public interface CustomerMapper {

	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	public abstract Customer customerModelTOEntity(CustomerModel model);

	@Named("entityToModel")
	public abstract CustomerModel entityToCustomerModel(Customer customer);

	@IterableMapping(qualifiedByName="entityToModel")
	public abstract List<CustomerModel> entityToCustomerModelList(List<Customer> response);
}
