package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Projects;
import com.excelr.model.Role;
import com.excelr.repo.RoleRepo;

@RestController
@CrossOrigin("*")
public class RoleController {
	
	@Autowired
	private RoleRepo repo;
	
	@PostMapping("/role")
	public Role createroRole(@RequestBody Role role) {
		return repo.save(role);
	}
	
	@GetMapping("/rolesget")
	public List<Role> getroRoles(){
		return repo.findAll();
	}

}
