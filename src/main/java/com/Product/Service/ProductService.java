package com.Product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Mapper.ProductMapper;
import com.Product.Model.ProductModel;
import com.Product.entity.Product;
import com.Product.respository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo prodRepo;
	
	public ProductModel getProduct(Integer id) {
		Optional<Product> response = prodRepo.findById(id);
		return ProductMapper.INSTANCE.entityToProductModel(response.get());

	}
	
	public ProductModel addProduct(ProductModel model){
		Product product=ProductMapper.INSTANCE.productModelToEntity(model);
		Product response= prodRepo.save(product);
		return  ProductMapper.INSTANCE.entityToProductModel(response);
		
	}
	public List<ProductModel> getAllProducts() {
		Iterable<Product> response = prodRepo.findAll();
		return ProductMapper.INSTANCE.entityToProductModel(response);

	}


}