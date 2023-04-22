package com.LoginApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoginApi.Entities.Admin;
import com.LoginApi.Entities.Credential;
import com.LoginApi.Service.AdminService;
import com.LoginApi.Service.LoginService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("login-rest")
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@Autowired
	AdminService adminservice;
	
	
	
    @CrossOrigin("http://localhost:4200/")
	@PostMapping("/signup")
	public List<Credential> signup(@RequestBody Credential credential)
	{
		
		return this.loginservice.signup(credential);
		
	}

	@PostMapping("/login")
	public List<Credential> login(@RequestBody Credential credential)
	{
		return this.loginservice.login(credential);
		
	}
	
    
    @CrossOrigin("http://localhost:4200/")
	@GetMapping("/fetch")
	public List<Credential> fetch()
	{
		return this.loginservice.fetch();
	}
    
	
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable long id)
	{
		loginservice.deleteAccount(id);
		
	}
	
	
	
	@PostMapping("/admin")
	public List<Admin> adminLog(Admin admin)
	{
		return  adminservice.login(admin);
	}
	
	@GetMapping("/test")
	public String test()
	{
		return  "done";
	}
	
	
	
	
	
	

	


}
