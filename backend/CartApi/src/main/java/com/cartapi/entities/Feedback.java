package com.cartapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Feedback {
	
	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(nullable=false)
	long userid;

	@Column(nullable=false)
	String username;
	
	@Column(nullable=false)
	String content;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Feedback(long id, long userid, String username, String content) {
		super();
		this.id = id;
		this.userid = userid;
		this.username = username;
		this.content = content;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
