package com.Product.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Model.FeedbackModel;
import com.Product.Service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	FeedbackService feedService;

	@PostMapping
	@RequestMapping("/feedback/")
	public ResponseEntity<FeedbackModel> createProduct(@Valid @RequestBody FeedbackModel feedRequest) {
		FeedbackModel feedResponse = feedService.addFeedback(feedRequest);
		return ResponseEntity.status(HttpStatus.OK).body(feedResponse);
	}

	@GetMapping
	@RequestMapping("get/feedbackAll/")
	public ResponseEntity<List<FeedbackModel>> getAllProduct() {
		List<FeedbackModel> feedResponse = feedService.getAllFeedbacks();
		return ResponseEntity.status(HttpStatus.OK).body(feedResponse);

	}

}
