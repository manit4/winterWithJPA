package com.winter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private String id;
	private String price;
	
	@OneToOne
	private User user;
	
	public Laptop() {
		
	}
	public Laptop(String id, String price) {
		super();
		this.id = id;
		this.price = price;
	}
	
	public Laptop(String id, String price, User user) {
		super();
		this.id = id;
		this.price = price;
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
