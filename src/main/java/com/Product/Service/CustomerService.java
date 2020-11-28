package com.Product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Helper.ProductHelper;
import com.Product.Mapper.CustomerMapper;
import com.Product.Model.CustomerModel;
import com.Product.entity.Customer;
import com.Product.respository.BillRepo;
import com.Product.respository.CustomerRepo;


@Service
public class CustomerService {

	@Autowired
	CustomerRepo customRepo;
	
	@Autowired
	ProductHelper prodHelper;
	
	@Autowired
	BillRepo prodRepo;
	
	public CustomerModel getCustomer(Integer id) {
		Optional<Customer> response = customRepo.findById(id);
		return CustomerMapper.INSTANCE.entityToCustomerModel(response.get());

	}


	public CustomerModel addCustomer(CustomerModel model) {
		Customer customer = CustomerMapper.INSTANCE.customerModelTOEntity(model);
		prodHelper.customerAssociation(customer);
		Customer response = customRepo.save(customer);
		return CustomerMapper.INSTANCE.entityToCustomerModel(response);

	}

	public List<CustomerModel> getAllCustomer() {
		Iterable<Customer> response = customRepo.findAll();
		return CustomerMapper.INSTANCE.entityToCustomerModel(response);

	}

	
	
}
