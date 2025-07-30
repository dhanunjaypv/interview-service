package com.interview.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.entities.User;
import com.interview.modeles.UserDTo;
import com.interview.repositories.UserRepository;
@RestController
@RequestMapping("/user")
public class UserController {
	
	 @Autowired
	 private  UserRepository userRepository;
	
	@PostMapping("/registration")
	 User userRegistration(@RequestBody UserDTo userDTo){
		
		User user=new User();
		user.setEmail(userDTo.getEmail());
		user.setName(userDTo.getName());
		
		
		return userRepository.save(user);
	}

	
	
	@PostMapping("/recharge")
	UserDTo recharge(@RequestBody UserDTo userDTo){
		
		
		return userDTo;
	}
	
	@DeleteMapping("/getAvailablePlans")
	UserDTo getAvaliablePlans(@RequestBody UserDTo userDTo){
		
		
		return userDTo;
	}
	
	
	

}
