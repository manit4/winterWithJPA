package com.winter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winter.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	public void deleteByEmail(String email);

}
