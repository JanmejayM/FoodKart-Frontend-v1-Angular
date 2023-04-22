package com.cartapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartapi.entities.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart,Long>{
	public List<Cart> findAllByUserid(long id);

	public List<Cart> findByUseridAndProductid(long userid, long productid);
    
	
}
