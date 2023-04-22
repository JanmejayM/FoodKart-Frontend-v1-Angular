package com.cartapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	
	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private long userid;
	
	@Column(nullable=false)
	private long productid;
	
	@Column(nullable=false)
	private int productqty;
	
	
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
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public int getProductqty() {
		return productqty;
	}
	public void setProductqty(int productqty) {
		this.productqty = productqty;
	}
		
		
	
	public Cart(long id, long userid, long productid, int productqty) {
		super();
		this.id = id;
		this.userid = userid;
		this.productid = productid;
		this.productqty = productqty;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
