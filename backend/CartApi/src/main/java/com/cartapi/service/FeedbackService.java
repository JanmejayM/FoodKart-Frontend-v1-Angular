package com.cartapi.service;

import java.util.List;

import com.cartapi.entities.Feedback;

public interface FeedbackService {
	
	public void addFeedback(Feedback feed);
	
	public List<Feedback> fetch();



}
