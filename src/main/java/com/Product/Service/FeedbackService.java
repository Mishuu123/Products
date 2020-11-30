package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Mapper.FeedbackMapper;
import com.Product.Model.FeedbackModel;
import com.Product.entity.Feedback;  
import com.Product.respository.FeedbackRepo;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepo feedRepo;

	public FeedbackModel addFeedback(FeedbackModel model) {
		Feedback feedback = FeedbackMapper.INSTANCE.feedbackModelToEntity(model);
		Feedback response = feedRepo.save(feedback);
		return FeedbackMapper.INSTANCE.entityToFeedbackModel(response);

	}

	public List<FeedbackModel> getAllFeedbacks() {
		Iterable<Feedback> response = feedRepo.findAll();
		return FeedbackMapper.INSTANCE.entityToFeedbackModel(response);

	}

}
