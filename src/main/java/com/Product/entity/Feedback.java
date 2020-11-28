package com.Product.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FEEDBACK")

public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "FEEDBACK_ID")
	private Integer id;

	@Column(name = "FEEDBACK_MEESAGE")
	private String feedback_message;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFeedback_message() {
		return feedback_message;
	}

	public void setFeedback_message(String feedback_message) {
		this.feedback_message = feedback_message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
