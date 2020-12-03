package com.Product.Mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Bill;
import com.Product.Model.BillModel;

@Mapper(uses = BillRefMapper.class)
public interface BillMapper {

	BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);

	public abstract BillModel entityToBillModel(Bill bill);

	@IterableMapping(qualifiedByName = "entityToModel")
	public abstract List<BillModel> entityToBillModelList(List<Bill> bills);

	@Named("modelToEntity")
	public abstract Bill billModelToEntity(BillModel model);

	@IterableMapping(qualifiedByName = "modelToEntity")
	public abstract List<Bill> modelToBillEntityList(List<BillModel> bills);

}
