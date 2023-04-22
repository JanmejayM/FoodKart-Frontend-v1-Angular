package com.LoginApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.LoginApi.Entities.Product;

public interface ProductService {

	public ResponseEntity<String> addProduct(Product p);
	public List<Product>fetch();
	public ResponseEntity<String> deleteProduct(long id);
	public ResponseEntity<String> updateProduct(Product p);
	public List<Product> fetchById(long id);
	public List<Product> fetchByIds(long []ids);



	
}
