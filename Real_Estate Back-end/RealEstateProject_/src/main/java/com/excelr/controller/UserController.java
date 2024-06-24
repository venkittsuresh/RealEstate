package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.User;
import com.excelr.repo.UserRepo;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/details")
	public User createUser(@RequestBody User user) {
		return repo.save(user);
	}
	
	@GetMapping("/detailsget")
	public List<User> getUsers(){
		return repo.findAll();
	}
	

}
