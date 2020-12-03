package com.Product.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Entity.User;
import com.Product.Exception.NoDataFoundException;
import com.Product.Mapper.UserMapper;
import com.Product.Model.UserModel;
import com.Product.Model.UserModelResponse;
import com.Product.Respository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public UserModel addUser(UserModel model) {
		User user = UserMapper.INSTANCE.userModelToEntity(model);
		User response = userRepo.save(user);
		return UserMapper.INSTANCE.entityToUserModel(response);

	}
	public UserModelResponse getUser(String email) {
		Optional<User> response = userRepo.findByEmail(email);
		if(response.isPresent()){
		
			return UserMapper.INSTANCE.entityToUserModelResponse(response.get()); 
		}
		else
		{
			throw new NoDataFoundException();
		}

		
}
	public void deleteUser(Integer id){
		userRepo.deleteById(id);
	
	}
}
