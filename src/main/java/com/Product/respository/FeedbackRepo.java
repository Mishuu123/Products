package com.Product.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Product.entity.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback, Integer> {

	Feedback save(Feedback feedback);
	
	Iterable<Feedback> findAll();
	

}
