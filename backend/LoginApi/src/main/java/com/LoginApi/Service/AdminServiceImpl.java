package com.LoginApi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginApi.Dao.AdminDao;
import com.LoginApi.Entities.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDao admindao;
	
	
	public List<Admin> login(Admin admin)
	{
		
		try {
	     List<Admin> ar1=admindao.findByUsernameAndPassword(admin.getUsername(),admin.getPassword());
	 
	      return ar1;
		}
		catch(Exception e)
		{
	      return new ArrayList<Admin>();
		}
	}


		

}
