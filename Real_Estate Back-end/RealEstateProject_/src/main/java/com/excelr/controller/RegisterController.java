package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Register;
import com.excelr.repo.RegisterRepository;



@RestController
public class RegisterController {
	
	@Autowired
	private RegisterRepository repo;

	@PostMapping(value="/register")
	public String register(@RequestBody Register register) {
		repo.save(register);
		return "Registered successfully"; 
	}
	
	@GetMapping(value="/getUsers")
	public List<Register> getList() {
		return repo.findAll();
	}
}