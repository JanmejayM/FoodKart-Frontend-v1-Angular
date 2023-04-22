package com.LoginApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.LoginApi.Entities.Product;
import com.LoginApi.Service.ProductService;

@RestController
@RequestMapping("product-rest")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
    @CrossOrigin("http://localhost:4200/")
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct( @RequestBody Product p)
	{
		return this.productservice.addProduct(p);
	}

    @CrossOrigin("http://localhost:4200/")
	@GetMapping("/fetch")
	public List<Product> fetchProduct()
	{
		return this.productservice.fetch();
	}
	
    @CrossOrigin("http://localhost:4200/")
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<String>deleteProduct(@PathVariable long id)
	{
		return this.productservice.deleteProduct(id);
	}
	
    @CrossOrigin("http://localhost:4200/")
	@PutMapping("/updateProduct")
	public ResponseEntity<String>updateProduct(@RequestBody Product p)
	{
		return this.productservice.updateProduct(p);
	}
    
    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/fetch/{Id}")
	public List<Product>fetchById(@PathVariable long Id)
	{
		return productservice.fetchById(Id);
	}
	
    @CrossOrigin("http://localhost:4200/")
    @RequestMapping(value="/fetchids/{Ids}", method=RequestMethod.GET)
	public List<Product>fetchByIds(@PathVariable long[] Ids)
	{
		return productservice.fetchByIds(Ids);
	}
    
    
    
	

}
