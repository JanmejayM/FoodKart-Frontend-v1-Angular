package com.cartapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartapi.dao.FeedbackDao;
import com.cartapi.entities.Feedback;


@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	
	@Autowired
	FeedbackDao feedbackdao;
	
	
	public void addFeedback(Feedback feed)
	{
      feedbackdao.save(feed);		
		
	}
	
	public List<Feedback> fetch()
	{
		List<Feedback>feed=feedbackdao.findAll();
		return feed;
	}

}
