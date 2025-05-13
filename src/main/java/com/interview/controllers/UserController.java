package com.interview.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interview.modeles.UserDTo;

@RestController
public class UserController {
	
	@PostMapping("/registration")
	UserDTo userRegistration(@RequestBody UserDTo userDTo){
		
		System.out.println(userDTo.getUserName() +" "+userDTo.getUserPhoneNumber());
		return userDTo;
	}

}
