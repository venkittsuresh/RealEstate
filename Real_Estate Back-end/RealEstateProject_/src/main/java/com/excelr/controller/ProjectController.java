package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Projects;
import com.excelr.repo.ProjectRepo;

@RestController
@CrossOrigin("*")
public class ProjectController {
	
	@Autowired
	private ProjectRepo repo;
	
	
	@PostMapping("/add")
	public Projects createProjects(@RequestBody Projects projects) {
		return repo.save(projects);
	}
	
	@GetMapping("/get")
	public List<Projects> getProjects(){
		return repo.findAll();
	}
	

}
