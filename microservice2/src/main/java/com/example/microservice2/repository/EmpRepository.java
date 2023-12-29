package com.example.microservice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.microservice2.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
