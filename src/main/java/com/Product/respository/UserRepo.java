package com.Product.Respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	 public User save(User user);

	 public Optional<User> getUserByemail(String email);
	 
	 public void deleteById(Integer id);
	
}
