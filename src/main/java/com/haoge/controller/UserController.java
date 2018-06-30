package com.haoge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haoge.entitys.User;
import com.haoge.repository.UserRepository;
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/user/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		User user = userRepository.getOne(id);
		return user;
		
	}

}
