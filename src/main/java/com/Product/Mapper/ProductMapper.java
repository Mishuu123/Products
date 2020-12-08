package com.Product.Mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Product;
import com.Product.Model.ProductModel;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE=Mappers.getMapper(ProductMapper.class);
	
	@Named("entityToModel")
	public  abstract ProductModel entityToProductModel(Product product);
	
	public abstract  Product productModelToEntity(ProductModel model);

	@IterableMapping(qualifiedByName = "entityToModel")
	public abstract List<ProductModel> entityToProductModelList(List<Product> products);

	
			
}
