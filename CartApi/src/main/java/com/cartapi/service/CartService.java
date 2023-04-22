package com.cartapi.service;

import java.util.List;

import com.cartapi.entities.Cart;

public interface CartService {
	
	public List<Cart>fetch(long id);
	public void addToCart(Cart c);
	public void deleteFromCart(Cart c);
	public boolean alreadyPresent(Cart c);
	public long getProductQty(long userid,long productid);
	public void updateProductQty(Cart c);
	



}
