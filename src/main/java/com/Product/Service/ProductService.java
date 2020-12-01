package com.Product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Entity.Product;
import com.Product.Exception.NoDataFoundException;
import com.Product.Mapper.ProductMapper;
import com.Product.Model.ProductModel;
import com.Product.Respository.ProductRepo;

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

	public void deleteProd(Integer id){
		prodRepo.deleteById(id);
	}

	public ProductModel updateProduct(ProductModel product, Integer id)
	{
		Optional<Product> response = prodRepo.findById(id);
		if(!response.isPresent()){
			 throw new NoDataFoundException();
		}
		product.setId(id);
			prodRepo.save(product);
		return ProductMapper.INSTANCE.entityToProductModel(response); 
	}
}