package com.LoginApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginApi.Entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Long>{
	
	

}
