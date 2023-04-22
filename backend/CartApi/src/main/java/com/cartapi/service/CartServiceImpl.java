package com.cartapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartapi.dao.CartDao;
import com.cartapi.entities.Cart;


@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartDao cartdao;
	
	public List<Cart>fetch(long id)
	{
		return cartdao.findAllByUserid(id);
	}
	
	public void addToCart(Cart c)
	{
		if(!alreadyPresent(c))
		{
			cartdao.save(c);

		}
		
		
		
		
		
	}
	
	public void deleteFromCart(Cart c)
	{
		cartdao.delete(c);
	}
	
	public boolean alreadyPresent(Cart c)
	{
		List<Cart>ls=cartdao.findByUseridAndProductid(c.getUserid(),c.getProductid());
		if(ls.size()==0)
		{
			return false;
		}
		
		System.out.println(ls.get(0).getProductqty());
		
		Cart t=new Cart(ls.get(0).getId(),c.getUserid(),c.getProductid(),ls.get(0).getProductqty()+1);
			
		cartdao.save(t);
			
		return true;
	}
	
	public long getProductQty(long userid,long productid)
	{
		List<Cart>ls=cartdao.findByUseridAndProductid(userid,productid);
		
		return ls.get(0).getProductqty();

	}
	
	
	public void updateProductQty(Cart c) {
		cartdao.save(c);
	}

	
	
	
	


}
