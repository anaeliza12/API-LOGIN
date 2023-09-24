package com.hacka.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hacka.demo.entities.Register;
import com.hacka.demo.repository.RegisterRepository;

public class RegisterService {

	@Autowired
	private RegisterRepository repository;

	public List<Register> findAll() {
		return repository.findAll();
	}

	public Register findById(Integer id) {
		return repository.findById(id).get();
	}

	public boolean insert(Register register) {
		if (repository.save(register) == null)
			return false;
		else
			return true;

	}
	
	

}
