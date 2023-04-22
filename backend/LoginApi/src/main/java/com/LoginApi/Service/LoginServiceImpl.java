package com.LoginApi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginApi.Dao.LoginDao;
import com.LoginApi.Entities.Credential;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao logindao;
	
	public List<Credential> signup(Credential c) 
	{
		
		//logindao.save(c);

		 List<Credential> ar1=new ArrayList<>();
		
		 ar1=logindao.findByUsername(c.getUsername());
		 
		  if(ar1.size()!=0)
		  {
			  return ar1;
		  }
		  logindao.save(c);
		  return new ArrayList<Credential>();

		
					
	
		
		 
	}
	
	public List<Credential> fetch()
	{
		
		List<Credential>ar=new ArrayList<>();
		   logindao.findAll()
		   .forEach(credential->ar.add(credential));
		   return ar;
	}
	public List<Credential> login(Credential c)
	{
		
		try {
	     List<Credential> ar1=logindao.findByUsernameAndPassword(c.getUsername(),c.getPassword());
	 
	      return ar1;
		}
		catch(Exception e)
		{
	      return new ArrayList<Credential>();
		}
	}
	
	public void deleteAccount(long id)
	{
		
		try {
		logindao.deleteById(id);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
	}
	
	
	
	
}
