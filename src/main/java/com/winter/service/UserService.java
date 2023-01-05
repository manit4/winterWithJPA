package com.winter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.entity.User;
import com.winter.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public void saveUser(User user) {
		
		repository.save(user);
	}
	
	public List<User> getAllUsers() {
		
		List<User> users = repository.findAll();
		
		return users;
	}
	
	public void delete(String username) {
		
		repository.deleteById(username);
	}
	
	public void deleteUserByEmail(String email) {
		
		repository.deleteByEmail(email);
	}
	
	public User findByUsername(String username) {
		
		User user = null;
		
		Optional<User> optional = repository.findById(username);
		
		if(optional.isPresent()) {
			
			user = optional.get();
		}
		return user;
	}

}
