package com.cartapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cartapi.entities.Cart;
import com.cartapi.service.CartService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("cart-rest")
public class CartController {

	@Autowired
	CartService cartservice;
	
	@GetMapping("/fetch/{id}")
	public List<Cart> fetch(@PathVariable long id)
	{
		return cartservice.fetch(id);
	}
	
	@PostMapping("/addCart")
	public void addToCart(@RequestBody Cart c)
	{
		cartservice.addToCart(c);
		
	}
	
	@PostMapping("/deleteCart")
	public void deleteFromCart(@RequestBody Cart c)
	{
		cartservice.deleteFromCart(c);
	}
	
	@GetMapping("/productQty/{userid}/{productid}")
	public long ProductQty(@PathVariable long productid,@PathVariable long userid)
	{
		return cartservice.getProductQty(userid, productid);
	}
	
	@PostMapping("/updateQty")
	public void updateQty(@RequestBody Cart c)
	{
		cartservice.updateProductQty(c);
	}
}
