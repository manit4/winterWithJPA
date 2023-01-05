package com.winter.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	private String username;
	private String password;
	private String name;
	private String email;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Laptop laptop;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address> addresses;
	
	public User() {

	}

	public User(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	

	public User(String username, String password, String name, String email, Laptop laptop) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.laptop = laptop;
	}
	
	

	public User(String username, String password, String name, String email, Laptop laptop, List<Address> addresses) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.laptop = laptop;
		this.addresses = addresses;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Laptop getLaptop() {
		return laptop;
	}
	
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
