package com.Product.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.Product.Entity.Address;
import com.Product.Model.AddressModel;

@Mapper
public interface AddressMapper {

	AddressMapper INSTANCE=Mappers.getMapper(AddressMapper.class);
	
	public abstract AddressModel entityToAddressModel(Address add);
	
	public abstract Address AddressModelToEntity(AddressModel model);
}
