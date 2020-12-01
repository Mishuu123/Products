package com.Product.Mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Product;
import com.Product.Model.ProductModel;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE=Mappers.getMapper(ProductMapper.class);
	
	public  abstract ProductModel entityToProductModel(Product product);
	
	public abstract  Product productModelToEntity(ProductModel model);

	public abstract List<ProductModel> entityToProductModel(Iterable<Product> response);

	public abstract ProductModel entityToProductModel(Optional<Product> response);
			
}
