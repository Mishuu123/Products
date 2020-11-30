package com.Product.Model;

public class FeedbackModel extends BaseModel {

	private String feedback_message;
	private Integer userId;

	public String getFeedback_message() {
		return feedback_message;
	}

	public void setFeedback_message(String feedback_message) {
		this.feedback_message = feedback_message;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
}
