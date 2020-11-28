package com.Product.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	 public User save(User user);

	 public Optional<User> getUserByemail(String email);
	
}
