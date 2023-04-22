package com.LoginApi.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginApi.Entities.Admin;


@Repository
public interface AdminDao extends JpaRepository<Admin,Long>{

	List<Admin> findByUsernameAndPassword(String username, String password);
	
	

}
