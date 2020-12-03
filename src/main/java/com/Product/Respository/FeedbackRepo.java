package com.Product.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback, Integer> {

}
