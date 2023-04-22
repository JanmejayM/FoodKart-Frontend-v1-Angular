package com.cartapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartapi.entities.Feedback;
import com.cartapi.service.FeedbackService;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("feedback-rest")
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackservice;
	
	
	
	@GetMapping("/test")
	public String test()
	{
		return "test";
	}
	
	@PostMapping("/addfeedback")
	public void addFeedback(@RequestBody Feedback f)
	{
		feedbackservice.addFeedback(f);
		
	}
	
	@GetMapping("/fetch")
	public List<Feedback> fetch()
	{
		return feedbackservice.fetch();
		
	}
	

}
