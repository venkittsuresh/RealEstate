package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer>{

 public	Register findByUsername(String username);

}
