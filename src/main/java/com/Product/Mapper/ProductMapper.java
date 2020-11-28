package com.Product.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.Product.Model.ProductModel;
import com.Product.entity.Product;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE=Mappers.getMapper(ProductMapper.class);
	
	public  abstract ProductModel entityToProductModel(Product product);
	
	public abstract  Product productModelToEntity(ProductModel model);

	public abstract List<ProductModel> entityToProductModel(Iterable<Product> response);
			
}
