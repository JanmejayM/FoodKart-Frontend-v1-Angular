package com.LoginApi.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginApi.Entities.Credential;

@Repository
public interface LoginDao extends JpaRepository<Credential,Long>{


	List<Credential> findByUsernameAndPassword(String userName, String passWord);

	List<Credential> findByUsername(String userName);

	
	

}
