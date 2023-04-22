package com.LoginApi.Service;

import java.util.List;

import com.LoginApi.Entities.Credential;

public interface LoginService {

	public List<Credential> signup(Credential c);
	public List<Credential>fetch();
	public List<Credential>login(Credential c);
	public void deleteAccount(long id);


	
	
}
