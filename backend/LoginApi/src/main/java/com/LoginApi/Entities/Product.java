package com.LoginApi.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Product {
	
	
	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name="product_name",nullable=false)
	String name;
	
	@Column(name="product_desc",nullable=false)
	String description;
	
	@Column(name="product_img",nullable=false)
	String image;
	
	@Column(name="product_price",nullable=false)
	long price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	

	public Product(long id, String name, String description, String image, long price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
