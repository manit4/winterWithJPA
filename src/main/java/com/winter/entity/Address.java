package com.winter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	private String addressId;
	private int houseNumber;
	private String city;
	private String state;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private User user;
	
	public Address() {
		
	}
	public Address(String addressId, int houseNumber, String city, String state) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
	}
	
	public Address(String addressId, int houseNumber, String city, String state, User user) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.user = user;
	}
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
