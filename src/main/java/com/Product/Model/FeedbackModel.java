package com.Product.Model;

public class FeedbackModel extends BaseModel {

	private String feedback_message;
	private UserModel user;

	public String getFeedback_message() {
		return feedback_message;
	}

	public void setFeedback_message(String feedback_message) {
		this.feedback_message = feedback_message;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

}
