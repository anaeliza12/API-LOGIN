package com.hacka.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hacka.demo.entities.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer>{

}
