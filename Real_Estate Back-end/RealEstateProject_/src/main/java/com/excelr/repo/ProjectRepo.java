package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Projects;

@Repository
public interface ProjectRepo extends JpaRepository<Projects, Integer> {

	public Projects findById(Projects projects);

}
