package com.Product.Mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.BillReference;
import com.Product.Model.BillRefModel;

@Mapper
public interface BillRefMapper {

	BillRefMapper INSTANCE = Mappers.getMapper(BillRefMapper.class);

	@Mapping(source = "billRefPk.productId", target = "productId")
	@Named("entityToModel")
	public abstract BillRefModel entityToBillModel(BillReference bill);

	@IterableMapping(qualifiedByName = "entityToModel")
	public abstract List<BillRefModel> entityToBillModelList(List<BillReference> bills);

	@Mapping(target = "billRefPk.productId", source = "productId")
	@Named("modelToEntity")
	public abstract BillReference billModelToEntity(BillRefModel model);

	@IterableMapping(qualifiedByName = "modelToEntity")
	public abstract List<BillReference> modelToBillEntityList(List<BillRefModel> bills);
}
