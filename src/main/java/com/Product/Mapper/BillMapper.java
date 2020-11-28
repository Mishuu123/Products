package com.Product.Mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.Product.Model.BillModel;
import com.Product.entity.Bill;

@Mapper(uses=ProductMapper.class)
public interface BillMapper {

	BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);

	public abstract BillModel entityToBillModel(Bill bill);

	public abstract Bill billModelToEntity(BillModel model);

	public abstract BillModel entityToBillModel(Optional<Bill> response);

	public abstract List<BillModel> entityToBillModel(Iterable<Bill> response);





}
