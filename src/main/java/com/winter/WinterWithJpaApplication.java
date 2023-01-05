package com.winter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.winter.entity.Address;
import com.winter.entity.Laptop;
import com.winter.entity.User;
import com.winter.service.UserService;

@SpringBootApplication
public class WinterWithJpaApplication implements CommandLineRunner{
	
	@Autowired
	UserService service;

	public static void main(String[] args) {
		SpringApplication.run(WinterWithJpaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Username!!");
//		String username = sc.next();
//		
//		System.out.println("Enter your Password!!");
//		String password = sc.next();
//		
//		System.out.println("Enter the Name!!");
//		String name = sc.next();
//		
//		System.out.println("Enter the Email Address");
//		String email = sc.next();
//		
//		User user = new User(username, password, name, email);
//		
//		service.saveUser(user);
//		
//	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		System.out.println("Fetching all the records...");
//		
//		List<User> users = service.getAllUsers();
//		
//		for(User user : users) {
//			
//			System.out.println(user.getUsername()+", "+user.getPassword()+", "+user.getName()+", "+user.getEmail());
//		}
//		
//	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the id which you wish to delete!!");
//		
//		String id = sc.next();
//		
//		service.delete(id);
//		
//		System.out.println("deleted successfully...");
//		
//		
//		
//	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the email which you wish to delete!!");
//		
//		String email = sc.next();
//		
//		service.deleteUserByEmail(email);
//		
//		System.out.println("deleted successfully...");	
//	}
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		User user = new User("nis@123456", "1234", "Nisha", "nis@yahoo.com");
//		
//		Laptop laptop = new Laptop("l_13", "990", user);
//		
//		user.setLaptop(laptop);
//		
//		
//		service.saveUser(user);
//		
//		
//		
//	}
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		User user = service.findByUsername("nis@123456");
//		
//		if(user != null) {
//			System.out.println(user.getUsername()+", "+user.getPassword()+", "+user.getName()+", "+user.getEmail());
//			
//			System.out.println("Below is the Laptop details...");
//			
//			System.out.println(user.getLaptop().getId()+", "+user.getLaptop().getPrice());
//		}
//		
//		else {
//			
//			System.out.println("No Data Present...");
//		}
//		
//		
//		
//	}
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		User user = new User("nis@12", "1234", "Nisha", "nis@gmail.com");
//		Laptop laptop = new Laptop("l_1", "1000");
//		user.setLaptop(laptop);
//		laptop.setUser(user);
//		
//		Address address1 = new Address("a_1", 101, "Abc", "Cba");
//		address1.setUser(user);
//		
//		Address address2 = new Address("a_2", 304, "Bcd", "Dcb");
//		address2.setUser(user);
//		
//		List<Address> addresses = new ArrayList<Address>();
//		addresses.add(address1);
//		addresses.add(address2);
//		
//		
//		user.setAddresses(addresses);
//		
//		
//		service.saveUser(user);
//		
//		
//		
//	}
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = service.findByUsername("nis@12");
		
		if(user != null) {
			
			System.out.println("Here is the User Primary Details...");
			
			System.out.println(user.getUsername()+", "+user.getPassword()+", "+user.getName()+", "+user.getEmail());
			
			System.out.println("Here is the User' Laptop Details...");
			
			Laptop laptop = user.getLaptop();
			
			System.out.println(laptop.getId()+", "+laptop.getPrice());
			
			List<Address> addresses = user.getAddresses();
			
			for(Address address : addresses) {
				
				System.out.println(address.getAddressId()+", "+address.getHouseNumber()+", "+address.getCity()+", "+address.getState());
			}
		}
		
		
		
	}

}
