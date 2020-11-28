package com.Product.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.Product.Model.UserModel;
import com.Product.Model.UserModelResponse;
import com.Product.entity.User;

@Mapper
public interface UserMapper{

	UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
	
	public abstract UserModel entityToUserModel(User user);
	
	public abstract User userModelToEntity(UserModel model);

	
	public abstract UserModelResponse entityToUserModelResponse( User user);
}
 